package fr.frinn.mekajs;

import dev.latvian.kubejs.script.ScriptType;
import fr.frinn.mekajs.gas.GasBuilder;
import fr.frinn.mekajs.gas.GasJS;
import fr.frinn.mekajs.gas.GasRegistryEventJS;
import mekanism.api.chemical.gas.Gas;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.LinkedHashMap;
import java.util.Map;

@Mod(MekaJS.MODID)
public class MekaJS {

    public static final String MODID = "mekajs";

    public static final Map<ResourceLocation, GasBuilder> GASES = new LinkedHashMap<>();

    @SuppressWarnings("deprecation")
    public MekaJS() {
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Gas.class, this::registerGases);

        DeferredWorkQueue.runLater(() -> (new GasRegistryEventJS()).post(ScriptType.STARTUP, "gas.registry"));
    }

    public void registerGases(final RegistryEvent.Register<Gas> event) {
        GASES.forEach((id, builder) -> {
            Gas gas = new GasJS(builder);
            gas.setRegistryName(id);
            event.getRegistry().register(gas);
        });
    }
}

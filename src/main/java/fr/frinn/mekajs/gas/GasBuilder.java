package fr.frinn.mekajs.gas;

import dev.latvian.kubejs.util.BuilderBase;
import net.minecraft.util.ResourceLocation;

public class GasBuilder extends BuilderBase {

    int color;
    ResourceLocation texture = new ResourceLocation("mekanism", "liquid/liquid");

    public GasBuilder(String name) {
        super(name);
    }

    public GasBuilder color(int color) {
        this.color = color;
        return this;
    }

    public GasBuilder texture(ResourceLocation texture) {
        this.texture = texture;
        return this;
    }

    @Override
    public String getType() {
        return "gas";
    }
}

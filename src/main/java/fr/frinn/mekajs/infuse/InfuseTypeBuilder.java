package fr.frinn.mekajs.infuse;

import dev.latvian.kubejs.util.BuilderBase;
import net.minecraft.util.ResourceLocation;

public class InfuseTypeBuilder extends BuilderBase {

    int color;
    ResourceLocation texture = new ResourceLocation("mekanism", "infuse_type/base");

    public InfuseTypeBuilder(String name) {
        super(name);
    }

    public InfuseTypeBuilder color(int color) {
        this.color = color;
        return this;
    }

    public InfuseTypeBuilder texture(ResourceLocation texture) {
        this.texture = texture;
        return this;
    }

    @Override
    public String getType() {
        return "infusetype";
    }
}

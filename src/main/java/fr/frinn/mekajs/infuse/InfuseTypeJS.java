package fr.frinn.mekajs.infuse;

import mekanism.api.chemical.infuse.InfuseType;

public class InfuseTypeJS extends InfuseType {

    public InfuseTypeJS(InfuseTypeBuilder builder) {
        super(mekanism.api.chemical.infuse.InfuseTypeBuilder.builder(builder.texture).color(builder.color));
    }
}

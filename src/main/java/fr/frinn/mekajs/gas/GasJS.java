package fr.frinn.mekajs.gas;

import mekanism.api.chemical.gas.Gas;

public class GasJS extends Gas {

    public GasJS(GasBuilder builder) {
        super(mekanism.api.chemical.gas.GasBuilder.builder().color(builder.color));
    }
}

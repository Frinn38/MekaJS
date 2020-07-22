package fr.frinn.mekajs.gas;

import dev.latvian.kubejs.util.BuilderBase;

public class GasBuilder extends BuilderBase {

    int color;

    public GasBuilder(String name) {
        super(name);
    }

    public GasBuilder color(int color) {
        this.color = color;
        return this;
    }

    @Override
    public String getType() {
        return "gas";
    }
}

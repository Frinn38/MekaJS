package fr.frinn.mekajs.gas;

import dev.latvian.kubejs.KubeJSObjects;
import dev.latvian.kubejs.event.EventJS;
import fr.frinn.mekajs.MekaJS;

public class GasRegistryEventJS extends EventJS {

    public GasRegistryEventJS() {

    }

    public GasBuilder create(String name) {
        GasBuilder builder = new GasBuilder(name);
        MekaJS.GASES.put(builder.id, builder);
        KubeJSObjects.ALL.add(builder);
        return builder;
    }
}

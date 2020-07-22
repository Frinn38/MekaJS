package fr.frinn.mekajs.infuse;

import dev.latvian.kubejs.KubeJSObjects;
import dev.latvian.kubejs.event.EventJS;
import fr.frinn.mekajs.MekaJS;

public class InfuseTypeRegistryEventJS  extends EventJS {

    public InfuseTypeRegistryEventJS() {

    }

    public InfuseTypeBuilder create(String name) {
        InfuseTypeBuilder builder = new InfuseTypeBuilder(name);
        MekaJS.INFUSE_TYPES.put(builder.id, builder);
        KubeJSObjects.ALL.add(builder);
        return builder;
    }
}

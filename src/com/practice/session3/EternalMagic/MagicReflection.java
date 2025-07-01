package com.practice.session3.EternalMagic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicReflection {

    public Class[] getClasses() {
        return JavaDonLibrary.class.getDeclaredClasses();
    }

    public Method[] getMethods(String className) throws ClassNotFoundException {
        String outerClassName = JavaDonLibrary.class.getName(); // "com.practice...JavaDonLibrary"
        String fullClassName = outerClassName + "$" + className;
        Class<?> c = Class.forName(fullClassName);
        return c.getDeclaredMethods();
    }


    public String callRevealHiddenSpell() throws Exception {
        Class<SecretsOfFlying> clazz = SecretsOfFlying.class;
        Method revealMethod = clazz.getDeclaredMethod("revealHiddenSpell");
        revealMethod.setAccessible(true);
        SecretsOfFlying instance = new SecretsOfFlying();
        return (String) revealMethod.invoke(instance);
    }

    public String callCastSpell(String spellName) throws Exception {
        Class<SecretsOfFlying> clazz = SecretsOfFlying.class;
        SecretsOfFlying instance = new SecretsOfFlying();

        Field spellField = clazz.getDeclaredField("spellName");
        spellField.setAccessible(true);
        spellField.set(instance, spellName);

        Method castMethod = clazz.getDeclaredMethod("castSpell");
        castMethod.setAccessible(true);
        return (String) castMethod.invoke(instance);
    }
}

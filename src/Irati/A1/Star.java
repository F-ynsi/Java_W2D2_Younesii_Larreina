package Irati.A1;



abstract class Star {

    public abstract void spectralType();
    public abstract void temperature();
    public abstract void luminosity();
    public abstract void mass();
    public abstract void lifeSpan();
}
class Blue extends Star {
    public void spectralType() {
        System.out.println("Blue stars have spectral types of either O or B.");
    }
    public void temperature() {
        System.out.println("Blue stars have temperatures around 30.000K.");
    }
    public void luminosity() {
        System.out.println("Blue stars have luminosity around 100 to 1 million times that of the Sun.");
    }
    public void mass() {
        System.out.println("Blue stars usually have a mass around 2.5 to 90 times that of the Sun.");
    }
    public void lifeSpan() {
        System.out.println("Blue stars last about 40 illion yeears.");
    }
}

class Yellow extends Star {
    public void spectralType() {
        System.out.println("Yellow Dwarfs have spectral type G.");
    }
    public void temperature() {
        System.out.println("Yellow dwarfs have temperatures between 5.200K to 7.500K.");
    }
    public void luminosity() {
        System.out.println("Yellow dwarfs have luminosities around 0.6 to 5.0 that of the Sun.");
    }
    public void mass() {
        System.out.println("Yellow dwarfs have a mass of around 0.8 to 1.4 that of the Sun.");
    }
    public void lifeSpan() {
        System.out.println("Yellow dwarfs last about 4 to 17 billion years.");
    }
}

class Orange extends Star {
    public void spectralType() {
        System.out.println("Orange dwarfs have spectral type K.");
    }
    public void temperature() {
        System.out.println("Orange dwarfs have temperatures between 3.700K to 5.200K.");
    }
    public void luminosity() {
        System.out.println("Orange dwarfs have luminosities around 0.08 to 0.6 that of the Sun.");
    }
    public void mass() {
        System.out.println("Orange dwarfs have a mass of 0.45 to 0.8 that of the Sun.");
    }
    public void lifeSpan() {
        System.out.println("Orange dwarfs last around 15 to 30 billion years.");
    }
}
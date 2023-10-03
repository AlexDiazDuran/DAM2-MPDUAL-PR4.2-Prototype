public class Forn extends Electrodomestic{
    public int temperatura;
    public boolean autoneteja;

    public Forn() {
    }

    public Forn(Forn target) {
        super(target);
        if (target != null) {
            this.temperatura = target.temperatura;
            this.autoneteja = target.autoneteja;
        }
    }

    @Override
    public Forn clone() {
        return new Forn(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;
        Forn cast2 = (Forn) object2;
        return cast2.temperatura == temperatura && cast2.autoneteja == autoneteja;
    }
}

package enumerator;

public enum EnumPromocion {
    CON() {
        @Override
        public boolean tiene() {
            return true;
        }
    },
    SIN() {
        @Override
        public boolean tiene() {
            return false;
        }
    };
    public boolean tiene() {
        return tiene();
    }
}

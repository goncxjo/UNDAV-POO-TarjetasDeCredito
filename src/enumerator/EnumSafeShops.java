package enumerator;

public enum EnumSafeShops {
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


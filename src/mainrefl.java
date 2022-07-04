public class mainrefl {

        public long x = 5;
        public long y = 10;
        private long z = 15;

        public mainrefl() {
        }

        public mainrefl(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void sqrX() {
            this.x *= this.x;
        }

        public void sqrY() {
            this.y *= this.y;
        }

        public void sqrZ() {
            this.z *= this.z;
        }

        public long getX() {
            return x;
        }

        public long getY() {
            return y;
        }

        public long getZ() {
            return z;
        }

        public void setX(long x) {
            this.x = x;
        }

        public void setY(long y) {
            this.y = y;
        }

        public void setZ(long z) {
            this.z = z;
        }

        public String toString() {
            return String.format("(x:%d, y:%d, z:%d)", x, y, z);
        }

    public void checkSquareA() {
    }
}


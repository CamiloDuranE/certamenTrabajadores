public class Region {
    private String region;

    public Region(String region){
        this.region = region;
    }

    @Override
    public String toString() {
        return "La region es : " + region;
    }

    public String getRegion(){
        return this.region;
    }

    public boolean equals(Region r){
        if (this == r) {
            return true;
        }
        if (r == null) {
            return false;
        }
        if (getClass() != r.getClass()) {
            return false;
        }
        final Region other = (Region) r;
        if (this.region != other.region) {
            return false;
        }
        return true;
    }
}

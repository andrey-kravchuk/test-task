import java.util.Objects;

public class SizeObject {

    private int id;
    private float sizeX;
    private float sizeY;
    private float sizeZ;


    public SizeObject() {
    }

    public SizeObject(int id, float sizeX, float sizeY, float sizeZ) {
        this.id = id;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    public float volume(){
        return sizeX * sizeY * sizeZ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSizeX() {
        return sizeX;
    }

    public void setSizeX(float sizeX) {
        this.sizeX = sizeX;
    }

    public float getSizeY() {
        return sizeY;
    }

    public void setSizeY(float sizeY) {
        this.sizeY = sizeY;
    }

    public float getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(float sizeZ) {
        this.sizeZ = sizeZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SizeObject that = (SizeObject) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SizeObject{" +
                "id=" + id +
                '}';
    }
}

import enums.Color;
import enums.Material;

public class HeavyBlock implements Block{

    private Color color;
    private Material material;

    public HeavyBlock(Color color, Material material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Material getMaterial() {
        return this.material;
    }
}

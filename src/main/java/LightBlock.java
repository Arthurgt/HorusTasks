import enums.Color;
import enums.Material;


public class LightBlock implements Block {
    private Color color;
    private Material material;

    public LightBlock(Color color, Material material) {
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

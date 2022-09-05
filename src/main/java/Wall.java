import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import enums.Color;
import enums.Material;

public class Wall implements Structure, CompositeBlock {

    private Color color;
    private Material material;

    private List<Block> blocks;

    public Wall() {
        this.blocks = new ArrayList<>();
    }

    public Wall(Color color, Material material) {
        this.color = color;
        this.material = material;
        this.blocks = new ArrayList<>();
    }

    public void addBlock(Block block) {
        this.blocks.add(block);
    }

    @Override
    public Optional findBlockByColor(Color color) {
        return Optional.of(blocks.stream().filter(block -> block.getColor() == color).findFirst().get());
    }

    @Override
    public List findBlocksByMaterial(Material material) {
        return blocks.stream().filter(block -> block.getMaterial() == material).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Material getMaterial() {
        return this.material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
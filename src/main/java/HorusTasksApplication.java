import enums.Color;
import enums.Material;

public class HorusTasksApplication {
    public static void main (String[] args) {

        Block block1 = new HeavyBlock(Color.BLACK, Material.STONE);
        Block block2 = new HeavyBlock(Color.GRAY, Material.METAL);
        Block block3 = new LightBlock(Color.BLUE, Material.WOOD);
        Block block4 = new LightBlock(Color.RED, Material.STONE);

        Wall wall = new Wall();
        wall.addBlock(block1);
        wall.addBlock(block2);
        wall.addBlock(block3);
        wall.addBlock(block4);

        System.out.println(wall.count());
        System.out.println(wall.findBlockByColor(Color.RED));
        System.out.println(wall.findBlocksByMaterial(Material.STONE));
    }
}

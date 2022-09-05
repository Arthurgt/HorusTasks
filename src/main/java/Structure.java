import enums.Color;
import enums.Material;

import java.util.List;
import java.util.Optional;

interface Structure {
    // zwraca dowolny element o podanym kolorze
    Optional findBlockByColor(Color color);

    // zwraca wszystkie elementy z danego materiału
    List findBlocksByMaterial(Material material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
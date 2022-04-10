package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class LionTest extends BaseTest{

    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        // Arrange
        Lion lion = new Lion("Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectCount = 1;

        // Act
        int actualCount = lion.getKittens();

        // Assert
        Assert.assertEquals(expectCount, actualCount);
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        // Arrange
        Lion lion = new Lion("Самка");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        // Act
        List<String> actualFood = lion.getFood();

        // Assert
        Assert.assertEquals(expectedFood, actualFood);
    }
}

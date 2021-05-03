package com.example.demo;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void forEach() {
    List<Integer> list = List.of(1, 2, 3);
    list.forEach(System.out::println);
	}

  @Test
  void filter() {
    List<Integer> list = List.of(1, 2, 3);
    List<Integer> actual = list
      .stream()
      .filter(el -> el == 3)
      .collect(toList());
    List<Integer> expected = List.of(3);
    assertEquals(expected, actual);
	}

  @Test
  void map() {
    List<Integer> list = List.of(1, 2, 3);
    List<Integer> actual = list
      .stream()
      .map(el -> el * 2)
      .collect(toList());
    List<Integer> expected = List.of(2, 4, 6);
    assertEquals(expected, actual);
	}

  @Test
  void reduce() {
    List<Integer> list = List.of(1, 2, 3);
    int actual = list
      .stream()
      .reduce(0, (subtotal, el) -> subtotal + el);
    int expected = 6;
    assertEquals(expected, actual);
	}

  @Test
  void anyMatch() {
    List<Integer> list = List.of(1, 2, 3);
    boolean actual = list
      .stream()
      .anyMatch(el -> el == 3);
    boolean expected = true;
    assertEquals(expected, actual);
	}

  @Test
  void allMatch() {
    List<Integer> list = List.of(1, 2, 3);
    boolean actual = list
      .stream()
      .allMatch(el -> el == 3);
    boolean expected = false;
    assertEquals(expected, actual);
	}

}

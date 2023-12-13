package study.stream;

import lombok.Getter;

import java.util.List;

@Getter
public class BuilderBuilding {

  String Candy;
  String Salt;
  public static void main(String[] args) {

    BuilderBuilding buildings = new BuilderBuilding();
    List<String> strList = List.of("qwewqe");
    strList.stream().forEach(x -> {
      Building building = Building.builder().
          sugar(buildings.getCandy()).
          candy(buildings.getSalt()).build();
    });

    strList.stream().map(x -> {
      Building building = Building.builder().
          sugar(buildings.getCandy()).
          candy(buildings.getSalt()).build();
      return building;
    });

  }
}

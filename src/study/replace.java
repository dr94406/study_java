package study;


public class replace {
  public static void main(String[] args) {
    String result = "AttachmentAddedException\n" + "AttachmentFileNotFoundException\n" + "AttachmentQuantityTooLargeException\n" + "AttachmentSizeTooLargeException\n" + "BadRequestException\n" + "CapacityNotEnoughException\n" + "CapacityNotFoundException\n" + "CapacitySaveException\n" + "CapacityTooLargeException\n" + "DataCreateException\n" + "DataDeleteException\n" + "DataNotFoundException\n" + "DataUpdateException\n" + "FileNotFoundException\n" + "FolderCreateException\n" + "FolderDeleteException\n" + "FolderNotFoundException\n" + "FolderUpdateException\n" + "ForbiddenException\n" + "NotFoundException\n" + "OptionBadRequestException\n" + "PermissionCreateException\n" + "PermissionNotFoundException\n" + "PermissionUpdateException\n" + "SearchCodeBadRequestException\n" + "TitleClassificationsCreatedException\n" + "TitleClassificationsSaveException\n" + "UnauthorizedException";
        if(result.contains("Exception")) {
          System.out.println(result.replace("Exception", "Error").toUpperCase());
    System.out.println(result);
        }
    }
  }

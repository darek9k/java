package javaCourse;

public class EnumExample {
    public static void main(String[] args) {

        PostStatus[] postStatuses = PostStatus.values();

        PostStatus enumExample = enumExample(postStatuses);
        System.out.println("enumExample: " + enumExample);

        for (PostStatus postStatus : postStatuses) {
            switchExample(postStatus);
        }

        for(int age = 1; age<30;age++){
            System.out.println(age + " : " + convertAgeToAgeIndex(age));
        }

        for (AgeIndex ageIndex : AgeIndex.values()) {
            System.out.println(ageIndex + " - isChild? " + !isAdultOrTeenager(ageIndex));
        }

    }
    //enum - label with a predetermined amount of values.

    private static PostStatus enumExample(PostStatus[] postStatuses) {

        for (PostStatus postStatus : postStatuses) {
            System.out.println(postStatus + ", ordinal: " + postStatus.ordinal());
        }

        return PostStatus.valueOf("NEW");
    }

    private static void ifExample(PostStatus postStatus) {
        if (postStatus == PostStatus.NEW) {
            System.out.println("Utworzono nowy post");
        } else if (postStatus == PostStatus.ACCEPTED) {
            System.out.println("Zaakceptowano post");
        } else if (postStatus == PostStatus.REJECTED) {
            System.out.println("Odrzucono post");
        } else {
            System.out.println("Nie obsluzony status");
            throw new IllegalArgumentException();
        }
    }

    private static void switchExample(PostStatus postStatus) {
        switch (postStatus) {
            case NEW -> System.out.println("Utworzony nowy post");
            case ACCEPTED -> System.out.println("Zaakcaptowano post");
            case REJECTED -> System.out.println("Odrzucono post");
            default -> {
                System.out.println("Nie obsłużonu status: " + postStatus);
                throw new IllegalArgumentException();
            }
        }
        System.out.println("Poza switchem");
    }

    private static AgeIndex convertAgeToAgeIndex(int age){
        if(age<=10){
            return AgeIndex.CHILD;
        }else if(age<18){
            return AgeIndex.TEENAGER;
        }else {
            return AgeIndex.ADULT;
        }
    }

    private static boolean isAdultOrTeenager(AgeIndex ageIndex){
        return switch (ageIndex) {
            case TEENAGER, ADULT -> true;
            case CHILD -> false;
            default -> throw new IllegalArgumentException();
        };
    }
//the old way
//    private static void switchExample(PostStatus postStatus) {
//        switch(postStatus){
//            case NEW:
//                System.out.println("Utworzony nowy post");
//                break;
//            case ACCEPTED:
//                System.out.println("Zaakcaptowano post");
//                break;
//            case REJECTED:
//                System.out.println("Odrzucono post");
//                break;
//            default:
//                System.out.println("Nie obsłużonu status: " + postStatus);
//                throw new IllegalArgumentException();
//        }
//        System.out.println("Poza switchem");
//    }

//in an ugly way
//    private static void switchExample(PostStatus postStatus) {
//        if (postStatus == PostStatus.NEW) {
//            System.out.println("Utworzono nowy post");
//        } else {
//            if (postStatus == PostStatus.ACCEPTED) {
//                System.out.println("Zaakceptowano post");
//            } else {
//                if (postStatus == PostStatus.REJECTED) {
//                    System.out.println("Odrzucono post");
//                } else {
//                    System.out.println("Nie obsluzony status");
//                    throw new IllegalArgumentException();
//                }
//            }
//        }
//    }
}



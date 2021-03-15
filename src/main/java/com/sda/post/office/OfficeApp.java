package com.sda.post.office;

public class OfficeApp {
    public static void main(String[] args) {

        PackageStatus status = PackageStatus.SENT;

        System.out.println(status.name());
        Package paczka = new Package(PackageStatus.COURIER, "monitor");
        System.out.println(paczka);

        Package myPackage = new Package(PackageStatus.LOST, "TV");
        System.out.println(myPackage);

        myPackage.changeStatus(PackageStatus.RETURNED);
        System.out.println(myPackage);

        PackageStatus[] packageStatuses = PackageStatus.values();
        for (PackageStatus packageStatus : packageStatuses) {
            System.out.println(packageStatus);
        }

        PackageStatus packageStatus = PackageStatus.valueOf("SENT");
        System.out.println(packageStatus);


        PackageStatus[] errorStatuses = PackageStatus.getErrorStatuses();
        for (PackageStatus packageStatus1 : errorStatuses) {
            System.out.println(packageStatus1);
        }

        System.out.println(PackageStatus.LOST.isError());
        System.out.println(PackageStatus.DELIVERED.isError());
    }
}

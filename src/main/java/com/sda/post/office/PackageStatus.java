package com.sda.post.office;

public enum PackageStatus {

    SENT("SENT"),
    TRAVELLING("TRAVELLING"),
    COURIER("COURIER"),
    DELIVERED("DELIVERED"),
    LOST("LOST"),
    RETURNED("RETURNED");

    private String description;

    PackageStatus(String d) {
        this.description = d;
    }

    public static PackageStatus[] getErrorStatuses() {
        return new PackageStatus[]{LOST, RETURNED};
    }

    public boolean isError() {
        return this == LOST || this == RETURNED;

    }


    @Override
    public String toString() {
        return "PackageStatus{" +
                "description='" + description + '\'' +
                '}';
    }
}

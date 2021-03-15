package com.sda.post.office;

import java.util.UUID;

public class Package {
    PackageStatus status;
    String contents;
    String id;

    public Package(PackageStatus status, String contents) {
        this.status = status;
        this.contents = contents;
        this.id = UUID.randomUUID().toString();
    }

    public void changeStatus(PackageStatus packageStatus) {
        this.status = packageStatus;
    }

    @Override
    public String toString() {
        return "Package{" +
                "status=" + status +
                ", zawartosc='" + contents + '\'' +
                ", nrPaczki='" + id + '\'' +
                '}';
    }
}

package org.codewars.leet;


public class FirstBadVersion {

    private final int badVersion;

    public FirstBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        int low = 1, high = n, mid;
        while(true) {
            mid = low + (high-low) / 2;
            if (isBadVersion(mid)) {
                if(mid == 1 || !isBadVersion(mid-1)){
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
    }

    public boolean isBadVersion(int num) {
        return num >= badVersion;
    }
}
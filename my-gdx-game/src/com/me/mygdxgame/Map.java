package com.me.mygdxgame;


public class Map {
    /*
     * Bird is only able to go 2 directions: left and right.
     *
     */

    private static int maxX = 5, maxY = 5, maxZ = 5;
//Temporary numbers, also waiting for
//position

    public static int spawnBird() {
        return maxX / 2;
    }

    public static int spawnPyramids() {
        Random rand = new Random();
        int x = 0, y = 0, z = 0;
        //Need to write basecase
        if (x == 0 || x == Bird.getX || y == 0 || z == 0) {
            x = rand.nextInt(maxX) + 1;
            y = maxY;
            z = rand.nextInt(maxZ) + 1;
        }
        return 5;//Temporary, error bugs me
    }

    public static int spawnPowerups() {
        Random rand = new Random();
        int x = 0, y = 0, z = 0;
        //Need to write basecase
        if (x == 0 || x == Bird.getX || y == 0 || z == 0) {
            x = rand.nextInt(maxX) + 1;
            y = maxY;
            z = rand.nextInt(maxZ) + 1;
        }

        return 5;//Temporary, error bugs me
    }

    public static int refreshPyramids(int y) {
        /*
         * Need the pyramids class
         */
        y--; //Pyramids move closer, bird stays the same.

        return 5; //Temporary, errors bug me
    }

    public static int refreshPowerups(int y) {
        /*
         * Need the powerups class
         */
        y--; //Powerups move closer, bird stays the same.
        return 5; //Temporary, error bugs me
    }
}


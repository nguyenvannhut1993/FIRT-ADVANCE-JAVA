/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task17_part2;

/**
 *
 * @author Nguyen Van Nhut
 */
public class ManagerAnimal {

    Fish[] A;
    Bird[] B;
    Boa[] C;
    Lion[] D;

    public ManagerAnimal(Fish[] A, Bird[] B, Boa[] C, Lion[] D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public ManagerAnimal() {
    }

    public Fish[] getA() {
        return A;
    }

    public void setA(Fish[] A) {
        this.A = A;
    }

    public Bird[] getB() {
        return B;
    }

    public void setB(Bird[] B) {
        this.B = B;
    }

    public Boa[] getC() {
        return C;
    }

    public void setC(Boa[] C) {
        this.C = C;
    }

    public Lion[] getD() {
        return D;
    }

    public void setD(Lion[] D) {
        this.D = D;
    }

    public boolean addAnimalFish(Fish C) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = C;
                return true;
            }

        }
        return false;
    }

    public boolean addAnimalBird(Bird C) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == null) {
                B[i] = C;
                return true;
            }

        }
        return false;
    }

    public boolean addAnimalBoa(Boa B) {
        for (int i = 0; i < C.length; i++) {
            if (C[i] == null) {
                C[i] = B;
                return true;
            }

        }
        return false;
    }

    public boolean addAnimalLion(Lion C) {
        for (int i = 0; i < D.length; i++) {
            if (D[i] == null) {
                D[i] = C;
                return true;
            }

        }
        return false;
    }

    void showFish() {
        for (Fish B : A) {
            if (B != null) {
                B.outputInfo();
            }
        }
    }

    void showBird() {
        for (Bird A : B) {
            if (A != null) {
                A.outputInfo();
            }
        }
    }

    void showBoa() {
        for (Boa A : C) {
            if (A != null) {
                A.outputInfo();
            }
        }
    }

    void showLion() {
        for (Lion A : D) {
            if (A != null) {
                A.outputInfo();
            }
        }
    }
}

package atividade01;

import java.util.Random;

public class BrincandoComOrdenacao {
    
    public static void main(String[] args) {
        int tamanho = 100000;
        Ordenacao ordenacao = new Ordenacao();

        // Criação de arrays

        int[] array1 = new int[tamanho]; // Crescente
        for (int i = 0; i < tamanho; i++) {
            array1[i] = i;
        }


        int[] array2 = new int[tamanho]; // Decrescente
        for (int i = 0; i < tamanho; i++) {
            array2[i] = tamanho - i;
        }


        int[] array3 = new int[tamanho]; // Aleatório
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            array3[i] = random.nextInt(tamanho);
        }


        Random random1 = new Random();
        int[] array4 = new int[tamanho]; // Constante
        for (int i = 0; i < tamanho; i++) {
            array4[i] = random.nextInt(1);

        }

        int[] array5 = new int[tamanho]; // Parciamente ordenado com dados desordenados no fim do array
        for (int i = 0; i < (tamanho * 90) / 100; i++) {
            array5[i] = i;
        }
        Random aleatorio = new Random();
        for (int i = (tamanho * 90) / 100; i < tamanho; i++) {
            array5[i] = aleatorio.nextInt(10000);
        }


        int[] array6 = new int[tamanho]; // Parciamente ordenado com dados desordenados no inicio do array
        Random aleatorio1 = new Random();
        for (int i = 0; i < (tamanho * 10) / 100; i++) {
            array6[i] = aleatorio.nextInt(10000);
        }
        for (int i = (tamanho * 10) / 100; i < tamanho; i++) {
            array6[i] = i;
        }


        /*
         * -=-=-=-=-=-=-=| Testes |=-=-=-=-=-=-==-
         */

        int quantidadeDeTestes = 1;

        // SelectionSort
        System.out.println("Selection Sort:");


        // Crescente
        long startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.selectionSort(array6.clone());
        }
        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // decrescente
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.selectionSort(array2.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // Aleatório
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.selectionSort(array3.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // Constante
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.selectionSort(array4.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no fim do array
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.selectionSort(array5.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no inicio do array
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.selectionSort(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // InsertionSort
            System.out.println("Insertion Sort:");


            // Crescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.insertionSort(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");




            // decrescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.insertionSort(array2.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Aleatório
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.insertionSort(array3.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Constante
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.insertionSort(array4.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no fim do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.insertionSort(array5.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no inicio do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.insertionSort(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");




        // MergeSort
        System.out.println("Merge Sort:");

        // Crescente
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.mergeSort(array6.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // decrescente
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.mergeSort(array2.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // Aleatório
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.mergeSort(array3.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // Constante
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.mergeSort(array4.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // Parciamente ordenado com dados desordenados no fim do array
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.mergeSort(array5.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");


        // Parciamente ordenado com dados desordenados no inicio do array
        startTime = System.nanoTime();
        for (int c = 0; c < quantidadeDeTestes; c++) {
            ordenacao.mergeSort(array6.clone());
        }
        endTime = System.nanoTime();
        elapsedTime = (endTime - startTime) / 1e9;
        System.out.println("Tempo de execução: " + elapsedTime + " segundos");




            // QuickSort
            System.out.println("Quick Sort:");


            // Crescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort(array1.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");




            // decrescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort(array2.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Aleatório
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort(array3.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");




            // Constante
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort(array4.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no fim do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort(array5.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no inicio do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // QuickSort_shuffle
            System.out.println("Quick Sort Shuffle:");
            // Crescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort_shuffle(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // decrescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort_shuffle(array2.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Aleatório
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort_shuffle(array3.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Constante
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort_shuffle(array4.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no fim do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort_shuffle(array5.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no inicio do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.quickSort_shuffle(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");


            // CountingSort
            System.out.println("Counting Sort:");


            // Crescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.countingSort(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // decrescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.countingSort(array2.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Aleatório
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.countingSort(array3.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Constante
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.countingSort(array4.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no fim do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.countingSort(array5.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no inicio do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.countingSort(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");




            // BubbleSort
            System.out.println("Bubble Sort:");

            // Crescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.bubbleSort(array5.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // decrescente
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.bubbleSort(array2.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Aleatório
            startTime = System.nanoTime();
            for (int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.bubbleSort(array3.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Constante
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.bubbleSort(array4.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no fim do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.bubbleSort(array5.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");



            // Parciamente ordenado com dados desordenados no inicio do array
            startTime = System.nanoTime();
            for ( int c = 0; c < quantidadeDeTestes; c++) {
                ordenacao.bubbleSort(array6.clone());
            }
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1e9;
            System.out.println("Tempo de execução: " + elapsedTime + " segundos");

        }


    }

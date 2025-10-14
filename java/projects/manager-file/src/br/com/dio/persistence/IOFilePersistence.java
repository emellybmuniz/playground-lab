package br.com.dio.persistence;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOFilePersistence implements FilePersistence{

    private final String currentDir = System.getProperty("user.dir");
    private final String storageDir = "/managedFiles/IO/";
    private final String fileName;

    public IOFilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currentDir + storageDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");
        clearFile();
    }

    @Override
    public void write(String data) {
        try (
                var fileWriter = new FileWriter(currentDir + storageDir + fileName, true);
                var bufferedWriter = new BufferedWriter(fileWriter);
                var printWriter = new PrintWriter(bufferedWriter)
                // Only allows autocloseable resources
        ) {
            printWriter.println(data);
            printWriter.flush(); //
        } catch (IOException ex) {
            Logger.getLogger(IOFilePersistence.class.getName()).log(Level.SEVERE, "Erro ao escrever no arquivo", ex);
        }
    }

@Override
public boolean remove(String sentence) {
    var content = findAll();
    var contentList = new ArrayList<>(Arrays.asList(content.split(System.lineSeparator())));
    if (contentList.stream().noneMatch(c -> c.contains(sentence))) return false;

    contentList.removeIf(c -> c.contains(sentence));

    try (var writer = new BufferedWriter(new FileWriter(currentDir + storageDir + fileName, false))) {
        for (String line : contentList) {
            if (!line.isEmpty()) {
                writer.write(line);
                writer.newLine();
            }
        }
    } catch (IOException ex) {
        Logger.getLogger(IOFilePersistence.class.getName()).log(Level.SEVERE, "Erro ao reescrever arquivo", ex);
        return false;
    }
    return true;
}

    @Override
    public String replace(String oldContent, String newContent) {
        var content = findAll();
        var contentList = new ArrayList<>(Arrays.asList(content.split(System.lineSeparator())));
        boolean replaced = false;

        for (int i = 0; i < contentList.size(); i++) {
            if (contentList.get(i).contains(oldContent)) {
                contentList.set(i, contentList.get(i).replace(oldContent, newContent));
                replaced = true;
            }
        }

        if (!replaced) {
            return "Nenhum registro encontrado para substituir.";
        }

        try (var writer = new BufferedWriter(new FileWriter(currentDir + storageDir + fileName, false))) {
            for (String line : contentList) {
                if (!line.isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(IOFilePersistence.class.getName()).log(Level.SEVERE, "Erro ao reescrever arquivo", ex);
            return "Erro ao reescrever arquivo.";
        }
        return String.join(System.lineSeparator(), contentList);
    }

    @Override
    public String findAll() {
        var content = new StringBuilder();
        try(var file = new BufferedReader(new FileReader(currentDir + storageDir + fileName))) {
            String line;
            while ((line = file.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            Logger.getLogger(IOFilePersistence.class.getName()).log(Level.SEVERE, "Erro ao ler arquivo");
        }
        return content.toString();
    }

    @Override
    public String findBy(String sentence) {
        String found = "Nenhum registro encontrado";
        try(var file = new BufferedReader(new FileReader(currentDir + storageDir + fileName))) {
            String line;
            while ((line = file.readLine()) != null) {
                if (line.contains(sentence)) {
                    found = line;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
            throw new RuntimeException(e);
        }
        return found;
    }

    @Override
    public String findAllBy(String sentence) {
        var result = new StringBuilder();
        try (var file = new BufferedReader(new FileReader(currentDir + storageDir + fileName))) {
            String line;
            while ((line = file.readLine()) != null) {
                if (line.contains(sentence)) {
                    result.append(line).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }

    private void clearFile() throws IOException {
        try (OutputStream outputStream = new FileOutputStream(currentDir + storageDir + fileName)) {
            System.out.println("Inicializando recursos");
            outputStream.write(new byte[0]); // Clean the file
        } catch (IOException ex) {
            throw new IOException("Erro ao limpar arquivo");
        }
    }
}

package com.example.managerstudent;
import javafx.scene.control.Alert;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Function {
    public static void addManagerToFile(List<ManagerStore> managers, File file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (ManagerStore o : managers) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ManagerStore> readManagerListFromFile(File file) {
        List<ManagerStore> managers = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null)
                    break;
                String eachManager[] = line.split(", ");
                int Id = Integer.parseInt(eachManager[0]);
                String name = eachManager[1];
                int age = Integer.parseInt(eachManager[2]);
                int month = Integer.parseInt(eachManager[3]);
                Float managerSalary = Float.parseFloat(eachManager[4]);
                managers.add(new ManagerStore(Id, name, age, month, managerSalary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return managers;
    }

    public static void SaveManagersToFile(List<ManagerStore> managers, File file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (ManagerStore o : managers) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addOfficerToFile(List<StaffStore> officers, File file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (StaffStore o : officers) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<StaffStore> readOfficerListFromFile(File file) {
        List<StaffStore> officers = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null)
                    break;
                String eachOfficer[] = line.split(", ");
                int Id = Integer.parseInt(eachOfficer[0]);
                String name = eachOfficer[1];
                int age = Integer.parseInt(eachOfficer[2]);
                int month = Integer.parseInt(eachOfficer[3]);
                float officerSalary = Float.parseFloat(eachOfficer[4]);
                officers.add(new StaffStore(Id, name, age, month, officerSalary));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return officers;
    }

    public static void SaveOfficerToFile(List<StaffStore> officers, File file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (StaffStore o : officers) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean IsManagerExisted(List<ManagerStore> managers, Integer IdToCheck) {
        for (ManagerStore o : managers) {
            if (IdToCheck == o.getId())
                return true;
        }
        return false;
    }

    public static boolean IsOfficerExisted(List<StaffStore> officers, Integer IdToCheck) {
        for (StaffStore o : officers) {
            if (IdToCheck == o.getId())
                return true;
        }
        return false;
    }

    public static void addComplete()
    {
        Alert addComplete = new Alert(Alert.AlertType.INFORMATION);
        addComplete.setTitle("Alert!");
        addComplete.setContentText("Add successfully");
        addComplete.show();
    }
    public static void addField()
    {
        Alert addFail = new Alert(Alert.AlertType.ERROR);
        addFail.setTitle("Alert!");
        addFail.setContentText("Please complete all fields!!!");
        addFail.show();
    }

    public static void employeeAlreadyExist()
    {
        Alert addFail = new Alert(Alert.AlertType.ERROR);
        addFail.setTitle("Alert!");
        addFail.setContentText("ID Already exist, please enter another ID!!!");
        addFail.show();
    }

    public static void enterAgainId()
    {
        Alert addFail = new Alert(Alert.AlertType.ERROR);
        addFail.setTitle("Alert!");
        addFail.setContentText("IDs are not allowed to be negative numbers, please enter another ID!!!");
        addFail.show();
    }

    public static void enterAgainAge()
    {
        Alert addFail = new Alert(Alert.AlertType.ERROR);
        addFail.setTitle("Alert!");
        addFail.setContentText("Age not less than 22 and older than 55, please enter another Age!!!");
        addFail.show();
    }

    public static void enterAgainMonth()
    {
        Alert addFail = new Alert(Alert.AlertType.ERROR);
        addFail.setTitle("Alert!");
        addFail.setContentText("Month not less than 1 and older than 12, please enter another Month!!!");
        addFail.show();
    }

    public static void enterAgainSalary()
    {
        Alert addFail = new Alert(Alert.AlertType.ERROR);
        addFail.setTitle("Alert!");
        addFail.setContentText("Salary are not allowed to be less than 1000$, please enter another Salary!!!");
        addFail.show();
    }

    public static void updateComplete()
    {
        Alert updateComplete = new Alert(Alert.AlertType.INFORMATION);
        updateComplete.setTitle("Alert!");
        updateComplete.setContentText("Update successfully");
        updateComplete.show();
    }
    public static void updateFail()
    {
        Alert updateFail = new Alert(Alert.AlertType.ERROR);
        updateFail.setTitle("Alert!");
        updateFail.setContentText("Update Fail!!!");
        updateFail.show();
    }
    public static void deleteComplete()
    {
        Alert deleteComplete = new Alert(Alert.AlertType.INFORMATION);
        deleteComplete.setTitle("Alert!");
        deleteComplete.setContentText("Delete successfully");
        deleteComplete.show();
    }
    public static void deleteFail()
    {
        Alert deleteFail = new Alert(Alert.AlertType.ERROR);
        deleteFail.setTitle("Alert!");
        deleteFail.setContentText("Delete Fail!!!");
        deleteFail.show();
    }
}

try {
processor.process();
} catch (NumberFormatException ne) {
System.out.println("Bad Data");
} catch (FileNotFoundException fe) {
System.out.println("Data File Missing");
} catch (Exception e) {
System.out.println(e.getMessage());
}

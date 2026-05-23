# MOTH — Manage Of Thine Health

A Java desktop application for tracking personal health and wellness. Built with Java Swing and NetBeans, MOTH provides a central menu that launches two separate tools: a wellness diary and a diet/hydration tracker.

## Apps included

### Diary App
A personal wellness journal with:
- Titled diary entries with a date field and freeform text
- A mood/feelings rating slider (1–10 scale)
- A meditation countdown timer (start/stop with configurable duration)
- Save and load entries to/from a file (`diaryLog.dat`)
- Display all stored entries in a scrollable text area

### Diet Tracker App
A nutrition and hydration logger with:
- Food entry logging — name, protein (g), carbohydrates (g), and fats (g)
- Hydration tracking — daily water intake and a target hydration goal
- Toggle between food diet mode and hydration mode via radio buttons
- Save and load entries to/from a file (`log.dat`)
- Display all stored entries in a scrollable text area

## Requirements

- Java 8 or higher
- NetBeans IDE (recommended — project includes `nbproject/` config)

## Getting started

1. Clone the repo
2. Open the project in NetBeans via `File → Open Project`
3. Build and run — `Main.java` is the entry point
4. Alternatively, compile and run manually:

```bash
javac -sourcepath src -d out src/Main.java
java -cp out Main
```

## Notes

- Both apps are in early development — several buttons (`Add`, `Display`, `Save`, `Load`, timer `Start/Stop`) have their event handlers stubbed out with `TODO` comments and are not yet fully implemented
- Data persistence uses Java object serialisation to `.dat` files in the project root

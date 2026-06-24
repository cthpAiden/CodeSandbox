# CodeSandbox — Java Practice & Progress Tracker

Personal repo storing Aiden's Java practice exercises and projects. Used to sync
work across multiple devices and to track progress (which exercises are done,
which are still in progress).

## Instructions for Claude (read carefully whenever asked to read this repo)

When the user pastes this repo's link and asks Claude to "grasp the context of
the codebase / project I'm working on", Claude should already understand the
following WITHOUT the user having to explain again:

1. **Purpose of the repo**: a place to store all of the user's practice exercises
   and coding progress. The user works on 2 different devices, so this repo is the
   main sync source. The user also keeps local copies but rarely reviews them, so
   GitHub is the primary place for reviewing and continuing work.

2. **When the user says "pull / bring the content to my folder"**: it means copy
   code from this repo into the local working folder the user currently has open
   in the session, so they can keep coding. Ask the user for the destination
   folder if it is not clear.

3. **This is a progress tracker**: many projects are unfinished. When reading,
   Claude should identify which projects are still in progress (empty methods,
   unfilled switch cases, etc.) so the user knows what is left to do.

4. **Required folder structure** (NetBeans Ant Java SE project):
   ```
   <ProjectName>/
       build.xml
       manifest.mf
       nbproject/
           project.xml
           project.properties
           genfiles.properties
       src/
           <package1>/   (e.g. Manager/, data/)
               *.java
           <package2>/
               *.java
   ```
   Each exercise is its own folder at the repo root, named after the project.
   Source files live under `src/` in the standard Java package layout (one
   folder per package). The `nbproject/` metadata and `build.xml` make NetBeans
   open the folder as a real Java project (coffee-cup icon) rather than a plain
   folder. NetBeans auto-generates `nbproject/build-impl.xml` on first open; the
   `build/`, `dist/`, and `nbproject/private/` folders are git-ignored.

Note: README and repo docs are written in English. Code (comments, prompts,
identifiers) may be in Vietnamese.

## Projects

| Project | Description | Status |
|---|---|---|
| QuanLyNhanVien | OOP: inheritance, polymorphism, instanceof, ArrayList, sort, search | In progress (menu cases 2-8 not yet implemented) |

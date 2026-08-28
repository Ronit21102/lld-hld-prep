1. Open your workspace (2 min)


bash
cd /Users/kredx/Desktop/LLD
gh issue view 79          # see the issue, resource link, checklist
Click the resource link in the issue — it's the AlgoMaster SOLID article.

2. Study — 30-45 min
Read the SOLID article. As you read, fill in NOTES.md:

For each principle (S, O, L, I, D): write a 1-line definition + a tiny code example of the violation and the fix
3. Code — 60-90 min
In src, write one small Java file per principle demonstrating it:



src/
  SingleResponsibility.java
  OpenClosed.java
  LiskovSubstitution.java
  InterfaceSegregation.java
  DependencyInversion.java
Each file: a bad example (commented) + a good example that compiles.

4. Reflect + commit — 15 min
Fill the "Key takeaways" and "Struggles" in DAILY_LOG.md (Day 1 entry is already there)
Update PROGRESS.md: change SOLID's [ ] to [x]
Commit and push:


bash
git add -A
git commit -m "Day 1: SOLID principles - notes + Java examples"
git push
5. Close the issue



bash
gh issue close 79 --remove-label in-progress --add-label done
6. Pick tomorrow's issue


bash
gh issue list --label todo --limit 5
# Tomorrow: #2 Strategy Pattern (the next LLD pattern in order)
The repeating loop (every day after)


gh issue view <number>      → read resource
fill NOTES.md               → study + design
write code in src/          → implement
update DAILY_LOG.md         → reflect
update PROGRESS.md          → check off
git add/commit/push         → save
gh issue close <number>     → mark done
That's it. Same 6 steps every day. The structure removes all decision fatigue — you just open the next todo issue and go.

Want me to also create a GitHub Project board (kanban: To Do → In Progress → Done) so you get a visual view alongside the issues?
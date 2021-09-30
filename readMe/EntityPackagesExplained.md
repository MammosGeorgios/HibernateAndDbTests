#db.entities.family
This is a simple example of parents/children. 
Things of note are:
- Parent/Child extend MappedSuperClass Human
- Human extends MappedSuperClass Metadata

Both MappedSuperClasses are simply extra columns in entities and not separate tables(not the most efficient way to do it, but it offers simplicity in code).

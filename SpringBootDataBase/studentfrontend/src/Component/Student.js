import React,{useEffect, useState} from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Paper,Button } from '@material-ui/core';


export default function Student() {
    const paperStyle = {padding:'50px 20px',width:600,margin:"20px auto"}
    const[studentName,setStudentName] = useState("")
    const[studentPinno,setStudentPinno] = useState("")
    const[students,setStudents] = useState([])
    const handleClick =
        (e)=>{
            e.preventDefault()
            const student = {studentName,studentPinno}
            console.log(student)
            fetch("http://localhost:8089/api/student/save",{
                method:"POST",headers:{"Content-Type":"application/json"},
                body:JSON.stringify(student)
            }).then(()=>{
                console.log("New Student Added");
            })
        }
    
        useEffect (()=>{
            fetch("http://localhost:8089/api/student/show")
            .then(res=>res.json).then((result)=>{
                setStudents(students)
            })
        })

  return (
    <component>
        <Paper elevation={3} style={paperStyle}>    
        <h1 style={{color:"blue"}}>
            <u>Add Student</u>
        </h1>
            <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1 },
      }}
      noValidate
      autoComplete="off"
    >
        <TextField id="standard-basic" label="Student Name" variant="outlined" fullWidth 
        value={studentName}
        onChange={(e)=>setStudentName(e.target.value)}
        />
        <TextField id="standard-basic" label="Student PinNumber" variant="outlined" fullWidth
         value={studentPinno}
         onChange={(e)=>setStudentPinno(e.target.value)}
        />
        <Button variant="contained" onClick={handleClick}>Submit</Button>
    </Box>
    </Paper>
    <Paper elevation={3} style={paperStyle}>
      {students.map(student=>(
        <Paper elevation={6} style={{margin:"10px",padding:"15px",textAlign:"left"}} key={student.id}>
            Id:{student.id}
            Name:{student.studentName}
            Pin Number:{student.studentPinno}
        </Paper>
      ))}
    </Paper>
    </component>
  );
}

@echo off
setlocal

REM 
if "%~1"=="" (
    echo Uso: tianex.bat ^<arquivo.c^>
    exit /b 1
)

REM 
set PROJECT_DIR=C:\Users\User\Documents\TrabalhoDeCompilador\CompiladorTianex

REM 
set FILE_PATH=%~f1

REM 
if not exist "%FILE_PATH%" (
    echo Arquivo nao encontrado: %~1
    exit /b 1
)

REM 
cd /d "%PROJECT_DIR%"

REM 
dotnet run -- "%FILE_PATH%"

endlocal
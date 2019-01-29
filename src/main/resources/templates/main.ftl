<#import "parts/common.ftl" as c>

<@c.page>
<div>
    <form name="1" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">Components: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control" name="components" id="components"
                       aria-describedby="componentsHelp" placeholder="Enter components">
                <small id="componentsHelp" class="form-text text-muted">Count of components.</small>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">Particles: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control" name="particles" id="particles"
                       aria-describedby="particlesHelp" placeholder="Enter particles">
                <small id="particlesHelp" class="form-text text-muted">Count of particles.</small>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">Basis: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control" name="basis" id="basis" aria-describedby="basisHelp"
                       placeholder="Enter basis">
                <small id="basisHelp" class="form-text text-muted">Count of basis.</small>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">Solution Points: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control" name="solutionPoints" id="solutionPoints"
                       aria-describedby="solutionPointsHelp" placeholder="Enter solutionPoints">
                <small id="solutionPointsHelp" class="form-text text-muted">Count of solutionPoints.</small>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">Diagram: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control col-form-label-sm" name="diagram" id="diagram" aria-describedby="diagramHelp"
                       placeholder="Enter diagram">
                <small id="diagramHelp" class="form-text text-muted">Count of diagram.</small>
            </div>
        </div>
        <div>
            <button class="btn btn-primary" type="submit">Confirm</button>
        </div>

    </form>
    <form name="2" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">functionIteration: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control" name="functionIteration" id="functionIteration"
                       aria-describedby="functionIterationHelp" placeholder="Enter functionIteration">
                <small id="functionIterationHelp" class="form-text text-muted">Count of functionIteration.</small>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">lnAIteration: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control" name="lnAIteration" id="lnAIteration"
                       aria-describedby="lnAIterationHelp" placeholder="Enter lnAIteration">
                <small id="lnAIterationHelp" class="form-text text-muted">Count of lnAIteration.</small>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label col-form-label-sm">Basis: </label>
            <div class="col-sm-2">
                <input type="number" class="form-control" name="ionForceIteration" id="ionForceIteration" aria-describedby="ionForceIterationHelp"
                       placeholder="Enter ionForceIteration">
                <small id="ionForceIterationHelp" class="form-text text-muted">Count of ionForceIteration.</small>
            </div>
        </div>
        <div>
            <button class="btn btn-primary" type="submit">Confirm</button>
        </div>
    </form>
</div>


</br><b>Dimensions</b></br>

<#list dimensions as propName, propValue>
    <div>
        ${propName}=${propValue}</br>
    </div>
</#list>

</br><b>Iterations</b></br>

<#list iterations as propName, propValue>
<div>
    ${propName}=${propValue}</br>
</div>
</#list>

</@c.page>
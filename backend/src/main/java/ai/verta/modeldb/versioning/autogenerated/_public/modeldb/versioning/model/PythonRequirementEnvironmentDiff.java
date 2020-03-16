// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.diff.ProtoType;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class PythonRequirementEnvironmentDiff implements ProtoType {
    public DiffStatusEnumDiffStatus Status;
    public PythonRequirementEnvironmentBlob A;
    public PythonRequirementEnvironmentBlob B;

    public PythonRequirementEnvironmentDiff() {
        this.Status = null;
        this.A = null;
        this.B = null;
    }

    public Boolean isEmpty() {
        if (this.Status != null) {
            return false;
        }
        if (this.A != null) {
            return false;
        }
        if (this.B != null) {
            return false;
        }
        return true;
    }

    public Boolean equals(PythonRequirementEnvironmentDiff other) {
        if (other == null) {
            return false;
        }
        {
            Function3<DiffStatusEnumDiffStatus,DiffStatusEnumDiffStatus,Boolean> f = (x, y) -> x.equals(y);
            if (this.Status != null || other.Status != null) {
                if (this.Status == null && other.Status != null)
                    return false;
                if (this.Status != null && other.Status == null)
                    return false;
                if (!f.apply(this.Status, other.Status))
                    return false;
            }
        }
        {
            Function3<PythonRequirementEnvironmentBlob,PythonRequirementEnvironmentBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.A != null || other.A != null) {
                if (this.A == null && other.A != null)
                    return false;
                if (this.A != null && other.A == null)
                    return false;
                if (!f.apply(this.A, other.A))
                    return false;
            }
        }
        {
            Function3<PythonRequirementEnvironmentBlob,PythonRequirementEnvironmentBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.B != null || other.B != null) {
                if (this.B == null && other.B != null)
                    return false;
                if (this.B != null && other.B == null)
                    return false;
                if (!f.apply(this.B, other.B))
                    return false;
            }
        }
        return true;
    }

    public PythonRequirementEnvironmentDiff setStatus(DiffStatusEnumDiffStatus value) {
        this.Status = value;
        return this;
    }
    public PythonRequirementEnvironmentDiff setA(PythonRequirementEnvironmentBlob value) {
        this.A = value;
        return this;
    }
    public PythonRequirementEnvironmentDiff setB(PythonRequirementEnvironmentBlob value) {
        this.B = value;
        return this;
    }

    static public PythonRequirementEnvironmentDiff fromProto(ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff blob) {
        if (blob == null) {
            return null;
        }

        PythonRequirementEnvironmentDiff obj = new PythonRequirementEnvironmentDiff();
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,DiffStatusEnumDiffStatus> f = x -> DiffStatusEnumDiffStatus.fromProto(blob.getStatus());
            obj.Status = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,PythonRequirementEnvironmentBlob> f = x -> PythonRequirementEnvironmentBlob.fromProto(blob.getA());
            obj.A = f.apply(blob);
        }
        {
            Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff,PythonRequirementEnvironmentBlob> f = x -> PythonRequirementEnvironmentBlob.fromProto(blob.getB());
            obj.B = f.apply(blob);
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder toProto() {
        ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder builder = ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.newBuilder();
        {
            if (this.Status != null) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder,Void> f = x -> { builder.setStatus(this.Status.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.A != null) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder,Void> f = x -> { builder.setA(this.A.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.B != null) {
                Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentDiff.Builder,Void> f = x -> { builder.setB(this.B.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitPythonRequirementEnvironmentDiff(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepDiffStatusEnumDiffStatus(this.Status);
        visitor.preVisitDeepPythonRequirementEnvironmentBlob(this.A);
        visitor.preVisitDeepPythonRequirementEnvironmentBlob(this.B);
    }

    public PythonRequirementEnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitPythonRequirementEnvironmentDiff(this);
    }

    public PythonRequirementEnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
        this.Status = visitor.postVisitDeepDiffStatusEnumDiffStatus(this.Status);
        this.A = visitor.postVisitDeepPythonRequirementEnvironmentBlob(this.A);
        this.B = visitor.postVisitDeepPythonRequirementEnvironmentBlob(this.B);
        return this.postVisitShallow(visitor);
    }
}
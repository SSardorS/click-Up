package uz.pdp.appclickup.payload;

import lombok.Data;
import uz.pdp.appclickup.entity.WorkspacePermission;
import uz.pdp.appclickup.entity.enums.AddType;
import uz.pdp.appclickup.entity.enums.WorkspacePermissionName;

import java.util.UUID;

@Data
public class WorkspacePermissionDto {
    private UUID role;

    private WorkspacePermissionName permission;

    private AddType addType;
}

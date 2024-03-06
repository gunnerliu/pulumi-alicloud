import * as pulumi from "@pulumi/pulumi";
import * as alicloud from "@pulumi/alicloud";

// const cbcTestTenant = new alicloud.ocean.Tenant("cbcTestTenant", {
//     tenantName: "cbcTestTenant",
//     cpu: 2,
//     memory: 10,
//     timeZone: "Asia/Shanghai",
//     tenantMode: "MySQL",
//     charset: "utf8mb4",
//     instanceId: "ob5jgvzvaq9m0w",
//     userVpcId: "vpc-bp1wthpj1estmaf84tu1b",
//     userVSwitchId: "vsw-bp1mthjmn4gneuvz5qwdz",
//     primaryZone: "cn-hangzhou-i"
// })

// const cbcTestTenantUser = new alicloud.ocean.TenantUser("cbcRoleTestTenantUser", {
//     tenantId: "t5jhonxxry79c",
//     instanceId: "ob5jgvzvaq9m0w",
//     userName: "cbcRoleTestTenantUser",
//     userType: "Normal",
//     userPassword: "cbcTestTenantUser11!",
//     roles: "[{\"Database\":\"cbcTestDatabase\",\"Role\":\"ReadOnly\"}]"
// })

const cbcTestDatabase = new alicloud.ocean.Database("cbcTestDatabase2", {
    tenantId: "t5jhonxxry79c",
    instanceId: "ob5jgvzvaq9m0w",
    databaseName: "cbcTestDatabase2",
    encoding: "utf8mb4"
})

// const ids = alicloud.ocean.getBaseInstances({});
// export const oceanBaseInstanceId1 = ids.then(ids => ids.instances?.[0]?.id);
// const nameRegex = alicloud.ocean.getBaseInstances({
//
// });
// export const oceanBaseInstanceId2 = nameRegex.then(nameRegex => nameRegex.instances?.[0]?.id);
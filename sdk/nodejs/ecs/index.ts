// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./autoProvisioningGroup";
export * from "./autoSnapshotPolicy";
export * from "./command";
export * from "./copyImage";
export * from "./dedicatedHost";
export * from "./disk";
export * from "./diskAttachment";
export * from "./ecsLaunchTemplate";
export * from "./ecsSnapshot";
export * from "./eip";
export * from "./eipAssociation";
export * from "./getAutoSnapshotPolicies";
export * from "./getCommands";
export * from "./getDedicatedHosts";
export * from "./getDisks";
export * from "./getEcsLaunchTemplates";
export * from "./getEcsSnapshots";
export * from "./getEips";
export * from "./getHpcClusters";
export * from "./getImages";
export * from "./getInstanceTypeFamilies";
export * from "./getInstanceTypes";
export * from "./getInstances";
export * from "./getKeyPairs";
export * from "./getNetworkInterfaces";
export * from "./getSecurityGroupRules";
export * from "./getSecurityGroups";
export * from "./getSnapshots";
export * from "./hpcCluster";
export * from "./image";
export * from "./imageCopy";
export * from "./imageExport";
export * from "./imageImport";
export * from "./imageSharePermission";
export * from "./instance";
export * from "./keyPair";
export * from "./keyPairAttachment";
export * from "./launchTemplate";
export * from "./reservedInstance";
export * from "./securityGroup";
export * from "./securityGroupRule";
export * from "./snapshot";
export * from "./snapshotPolicy";

// Import resources to register:
import { AutoProvisioningGroup } from "./autoProvisioningGroup";
import { AutoSnapshotPolicy } from "./autoSnapshotPolicy";
import { Command } from "./command";
import { CopyImage } from "./copyImage";
import { DedicatedHost } from "./dedicatedHost";
import { Disk } from "./disk";
import { DiskAttachment } from "./diskAttachment";
import { EcsLaunchTemplate } from "./ecsLaunchTemplate";
import { EcsSnapshot } from "./ecsSnapshot";
import { Eip } from "./eip";
import { EipAssociation } from "./eipAssociation";
import { HpcCluster } from "./hpcCluster";
import { Image } from "./image";
import { ImageCopy } from "./imageCopy";
import { ImageExport } from "./imageExport";
import { ImageImport } from "./imageImport";
import { ImageSharePermission } from "./imageSharePermission";
import { Instance } from "./instance";
import { KeyPair } from "./keyPair";
import { KeyPairAttachment } from "./keyPairAttachment";
import { LaunchTemplate } from "./launchTemplate";
import { ReservedInstance } from "./reservedInstance";
import { SecurityGroup } from "./securityGroup";
import { SecurityGroupRule } from "./securityGroupRule";
import { Snapshot } from "./snapshot";
import { SnapshotPolicy } from "./snapshotPolicy";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:ecs/autoProvisioningGroup:AutoProvisioningGroup":
                return new AutoProvisioningGroup(name, <any>undefined, { urn })
            case "alicloud:ecs/autoSnapshotPolicy:AutoSnapshotPolicy":
                return new AutoSnapshotPolicy(name, <any>undefined, { urn })
            case "alicloud:ecs/command:Command":
                return new Command(name, <any>undefined, { urn })
            case "alicloud:ecs/copyImage:CopyImage":
                return new CopyImage(name, <any>undefined, { urn })
            case "alicloud:ecs/dedicatedHost:DedicatedHost":
                return new DedicatedHost(name, <any>undefined, { urn })
            case "alicloud:ecs/disk:Disk":
                return new Disk(name, <any>undefined, { urn })
            case "alicloud:ecs/diskAttachment:DiskAttachment":
                return new DiskAttachment(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsLaunchTemplate:EcsLaunchTemplate":
                return new EcsLaunchTemplate(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsSnapshot:EcsSnapshot":
                return new EcsSnapshot(name, <any>undefined, { urn })
            case "alicloud:ecs/eip:Eip":
                return new Eip(name, <any>undefined, { urn })
            case "alicloud:ecs/eipAssociation:EipAssociation":
                return new EipAssociation(name, <any>undefined, { urn })
            case "alicloud:ecs/hpcCluster:HpcCluster":
                return new HpcCluster(name, <any>undefined, { urn })
            case "alicloud:ecs/image:Image":
                return new Image(name, <any>undefined, { urn })
            case "alicloud:ecs/imageCopy:ImageCopy":
                return new ImageCopy(name, <any>undefined, { urn })
            case "alicloud:ecs/imageExport:ImageExport":
                return new ImageExport(name, <any>undefined, { urn })
            case "alicloud:ecs/imageImport:ImageImport":
                return new ImageImport(name, <any>undefined, { urn })
            case "alicloud:ecs/imageSharePermission:ImageSharePermission":
                return new ImageSharePermission(name, <any>undefined, { urn })
            case "alicloud:ecs/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            case "alicloud:ecs/keyPair:KeyPair":
                return new KeyPair(name, <any>undefined, { urn })
            case "alicloud:ecs/keyPairAttachment:KeyPairAttachment":
                return new KeyPairAttachment(name, <any>undefined, { urn })
            case "alicloud:ecs/launchTemplate:LaunchTemplate":
                return new LaunchTemplate(name, <any>undefined, { urn })
            case "alicloud:ecs/reservedInstance:ReservedInstance":
                return new ReservedInstance(name, <any>undefined, { urn })
            case "alicloud:ecs/securityGroup:SecurityGroup":
                return new SecurityGroup(name, <any>undefined, { urn })
            case "alicloud:ecs/securityGroupRule:SecurityGroupRule":
                return new SecurityGroupRule(name, <any>undefined, { urn })
            case "alicloud:ecs/snapshot:Snapshot":
                return new Snapshot(name, <any>undefined, { urn })
            case "alicloud:ecs/snapshotPolicy:SnapshotPolicy":
                return new SnapshotPolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "ecs/autoProvisioningGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/autoSnapshotPolicy", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/command", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/copyImage", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/dedicatedHost", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/disk", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/diskAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsLaunchTemplate", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsSnapshot", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/eip", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/eipAssociation", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/hpcCluster", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/image", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/imageCopy", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/imageExport", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/imageImport", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/imageSharePermission", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/instance", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/keyPair", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/keyPairAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/launchTemplate", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/reservedInstance", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/securityGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/securityGroupRule", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/snapshot", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/snapshotPolicy", _module)

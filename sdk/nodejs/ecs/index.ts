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
export * from "./ecsAutoSnapshotPolicyAttachment";
export * from "./ecsDedicatedHostCluster";
export * from "./ecsDeploymentSet";
export * from "./ecsDisk";
export * from "./ecsDiskAttachment";
export * from "./ecsImageComponent";
export * from "./ecsImagePipeline";
export * from "./ecsInvocation";
export * from "./ecsKeyPair";
export * from "./ecsKeyPairAttachment";
export * from "./ecsLaunchTemplate";
export * from "./ecsNetworkInterface";
export * from "./ecsNetworkInterfaceAttachment";
export * from "./ecsNetworkInterfacePermission";
export * from "./ecsPrefixList";
export * from "./ecsSessionManagerStatus";
export * from "./ecsSnapshot";
export * from "./ecsSnapshotGroup";
export * from "./eip";
export * from "./eipAddress";
export * from "./eipAssociation";
export * from "./getAutoSnapshotPolicies";
export * from "./getCommands";
export * from "./getDedicatedHosts";
export * from "./getDisks";
export * from "./getEcsDedicatedHostClusters";
export * from "./getEcsDeploymentSets";
export * from "./getEcsDisks";
export * from "./getEcsImageComponents";
export * from "./getEcsImagePipeline";
export * from "./getEcsInvocations";
export * from "./getEcsKeyPairs";
export * from "./getEcsLaunchTemplates";
export * from "./getEcsNetworkInterfacePermissions";
export * from "./getEcsNetworkInterfaces";
export * from "./getEcsPrefixLists";
export * from "./getEcsSnapshotGroups";
export * from "./getEcsSnapshots";
export * from "./getEcsStorageCapacityUnits";
export * from "./getEipAddresses";
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
export * from "./storageCapacityUnit";

// Import resources to register:
import { AutoProvisioningGroup } from "./autoProvisioningGroup";
import { AutoSnapshotPolicy } from "./autoSnapshotPolicy";
import { Command } from "./command";
import { CopyImage } from "./copyImage";
import { DedicatedHost } from "./dedicatedHost";
import { Disk } from "./disk";
import { DiskAttachment } from "./diskAttachment";
import { EcsAutoSnapshotPolicyAttachment } from "./ecsAutoSnapshotPolicyAttachment";
import { EcsDedicatedHostCluster } from "./ecsDedicatedHostCluster";
import { EcsDeploymentSet } from "./ecsDeploymentSet";
import { EcsDisk } from "./ecsDisk";
import { EcsDiskAttachment } from "./ecsDiskAttachment";
import { EcsImageComponent } from "./ecsImageComponent";
import { EcsImagePipeline } from "./ecsImagePipeline";
import { EcsInvocation } from "./ecsInvocation";
import { EcsKeyPair } from "./ecsKeyPair";
import { EcsKeyPairAttachment } from "./ecsKeyPairAttachment";
import { EcsLaunchTemplate } from "./ecsLaunchTemplate";
import { EcsNetworkInterface } from "./ecsNetworkInterface";
import { EcsNetworkInterfaceAttachment } from "./ecsNetworkInterfaceAttachment";
import { EcsNetworkInterfacePermission } from "./ecsNetworkInterfacePermission";
import { EcsPrefixList } from "./ecsPrefixList";
import { EcsSessionManagerStatus } from "./ecsSessionManagerStatus";
import { EcsSnapshot } from "./ecsSnapshot";
import { EcsSnapshotGroup } from "./ecsSnapshotGroup";
import { Eip } from "./eip";
import { EipAddress } from "./eipAddress";
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
import { StorageCapacityUnit } from "./storageCapacityUnit";

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
            case "alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment":
                return new EcsAutoSnapshotPolicyAttachment(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsDedicatedHostCluster:EcsDedicatedHostCluster":
                return new EcsDedicatedHostCluster(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet":
                return new EcsDeploymentSet(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsDisk:EcsDisk":
                return new EcsDisk(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsDiskAttachment:EcsDiskAttachment":
                return new EcsDiskAttachment(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsImageComponent:EcsImageComponent":
                return new EcsImageComponent(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsImagePipeline:EcsImagePipeline":
                return new EcsImagePipeline(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsInvocation:EcsInvocation":
                return new EcsInvocation(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsKeyPair:EcsKeyPair":
                return new EcsKeyPair(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment":
                return new EcsKeyPairAttachment(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsLaunchTemplate:EcsLaunchTemplate":
                return new EcsLaunchTemplate(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsNetworkInterface:EcsNetworkInterface":
                return new EcsNetworkInterface(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsNetworkInterfaceAttachment:EcsNetworkInterfaceAttachment":
                return new EcsNetworkInterfaceAttachment(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission":
                return new EcsNetworkInterfacePermission(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsPrefixList:EcsPrefixList":
                return new EcsPrefixList(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus":
                return new EcsSessionManagerStatus(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsSnapshot:EcsSnapshot":
                return new EcsSnapshot(name, <any>undefined, { urn })
            case "alicloud:ecs/ecsSnapshotGroup:EcsSnapshotGroup":
                return new EcsSnapshotGroup(name, <any>undefined, { urn })
            case "alicloud:ecs/eip:Eip":
                return new Eip(name, <any>undefined, { urn })
            case "alicloud:ecs/eipAddress:EipAddress":
                return new EipAddress(name, <any>undefined, { urn })
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
            case "alicloud:ecs/storageCapacityUnit:StorageCapacityUnit":
                return new StorageCapacityUnit(name, <any>undefined, { urn })
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
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsAutoSnapshotPolicyAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsDedicatedHostCluster", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsDeploymentSet", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsDisk", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsDiskAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsImageComponent", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsImagePipeline", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsInvocation", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsKeyPair", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsKeyPairAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsLaunchTemplate", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsNetworkInterface", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsNetworkInterfaceAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsNetworkInterfacePermission", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsPrefixList", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsSessionManagerStatus", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsSnapshot", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/ecsSnapshotGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/eip", _module)
pulumi.runtime.registerResourceModule("alicloud", "ecs/eipAddress", _module)
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
pulumi.runtime.registerResourceModule("alicloud", "ecs/storageCapacityUnit", _module)

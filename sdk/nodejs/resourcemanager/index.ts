// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AccountArgs, AccountState } from "./account";
export type Account = import("./account").Account;
export const Account: typeof import("./account").Account = null as any;
utilities.lazyLoad(exports, ["Account"], () => require("./account"));

export { ControlPolicyArgs, ControlPolicyState } from "./controlPolicy";
export type ControlPolicy = import("./controlPolicy").ControlPolicy;
export const ControlPolicy: typeof import("./controlPolicy").ControlPolicy = null as any;
utilities.lazyLoad(exports, ["ControlPolicy"], () => require("./controlPolicy"));

export { ControlPolicyAttachmentArgs, ControlPolicyAttachmentState } from "./controlPolicyAttachment";
export type ControlPolicyAttachment = import("./controlPolicyAttachment").ControlPolicyAttachment;
export const ControlPolicyAttachment: typeof import("./controlPolicyAttachment").ControlPolicyAttachment = null as any;
utilities.lazyLoad(exports, ["ControlPolicyAttachment"], () => require("./controlPolicyAttachment"));

export { DelegatedAdministratorArgs, DelegatedAdministratorState } from "./delegatedAdministrator";
export type DelegatedAdministrator = import("./delegatedAdministrator").DelegatedAdministrator;
export const DelegatedAdministrator: typeof import("./delegatedAdministrator").DelegatedAdministrator = null as any;
utilities.lazyLoad(exports, ["DelegatedAdministrator"], () => require("./delegatedAdministrator"));

export { FolderArgs, FolderState } from "./folder";
export type Folder = import("./folder").Folder;
export const Folder: typeof import("./folder").Folder = null as any;
utilities.lazyLoad(exports, ["Folder"], () => require("./folder"));

export { GetAccountDeletionCheckTaskArgs, GetAccountDeletionCheckTaskResult, GetAccountDeletionCheckTaskOutputArgs } from "./getAccountDeletionCheckTask";
export const getAccountDeletionCheckTask: typeof import("./getAccountDeletionCheckTask").getAccountDeletionCheckTask = null as any;
export const getAccountDeletionCheckTaskOutput: typeof import("./getAccountDeletionCheckTask").getAccountDeletionCheckTaskOutput = null as any;
utilities.lazyLoad(exports, ["getAccountDeletionCheckTask","getAccountDeletionCheckTaskOutput"], () => require("./getAccountDeletionCheckTask"));

export { GetAccountsArgs, GetAccountsResult, GetAccountsOutputArgs } from "./getAccounts";
export const getAccounts: typeof import("./getAccounts").getAccounts = null as any;
export const getAccountsOutput: typeof import("./getAccounts").getAccountsOutput = null as any;
utilities.lazyLoad(exports, ["getAccounts","getAccountsOutput"], () => require("./getAccounts"));

export { GetControlPoliciesArgs, GetControlPoliciesResult, GetControlPoliciesOutputArgs } from "./getControlPolicies";
export const getControlPolicies: typeof import("./getControlPolicies").getControlPolicies = null as any;
export const getControlPoliciesOutput: typeof import("./getControlPolicies").getControlPoliciesOutput = null as any;
utilities.lazyLoad(exports, ["getControlPolicies","getControlPoliciesOutput"], () => require("./getControlPolicies"));

export { GetControlPolicyAttachmentsArgs, GetControlPolicyAttachmentsResult, GetControlPolicyAttachmentsOutputArgs } from "./getControlPolicyAttachments";
export const getControlPolicyAttachments: typeof import("./getControlPolicyAttachments").getControlPolicyAttachments = null as any;
export const getControlPolicyAttachmentsOutput: typeof import("./getControlPolicyAttachments").getControlPolicyAttachmentsOutput = null as any;
utilities.lazyLoad(exports, ["getControlPolicyAttachments","getControlPolicyAttachmentsOutput"], () => require("./getControlPolicyAttachments"));

export { GetDelegatedAdministratorsArgs, GetDelegatedAdministratorsResult, GetDelegatedAdministratorsOutputArgs } from "./getDelegatedAdministrators";
export const getDelegatedAdministrators: typeof import("./getDelegatedAdministrators").getDelegatedAdministrators = null as any;
export const getDelegatedAdministratorsOutput: typeof import("./getDelegatedAdministrators").getDelegatedAdministratorsOutput = null as any;
utilities.lazyLoad(exports, ["getDelegatedAdministrators","getDelegatedAdministratorsOutput"], () => require("./getDelegatedAdministrators"));

export { GetFoldersArgs, GetFoldersResult, GetFoldersOutputArgs } from "./getFolders";
export const getFolders: typeof import("./getFolders").getFolders = null as any;
export const getFoldersOutput: typeof import("./getFolders").getFoldersOutput = null as any;
utilities.lazyLoad(exports, ["getFolders","getFoldersOutput"], () => require("./getFolders"));

export { GetHandshakesArgs, GetHandshakesResult, GetHandshakesOutputArgs } from "./getHandshakes";
export const getHandshakes: typeof import("./getHandshakes").getHandshakes = null as any;
export const getHandshakesOutput: typeof import("./getHandshakes").getHandshakesOutput = null as any;
utilities.lazyLoad(exports, ["getHandshakes","getHandshakesOutput"], () => require("./getHandshakes"));

export { GetPoliciesArgs, GetPoliciesResult, GetPoliciesOutputArgs } from "./getPolicies";
export const getPolicies: typeof import("./getPolicies").getPolicies = null as any;
export const getPoliciesOutput: typeof import("./getPolicies").getPoliciesOutput = null as any;
utilities.lazyLoad(exports, ["getPolicies","getPoliciesOutput"], () => require("./getPolicies"));

export { GetPolicyAttachmentsArgs, GetPolicyAttachmentsResult, GetPolicyAttachmentsOutputArgs } from "./getPolicyAttachments";
export const getPolicyAttachments: typeof import("./getPolicyAttachments").getPolicyAttachments = null as any;
export const getPolicyAttachmentsOutput: typeof import("./getPolicyAttachments").getPolicyAttachmentsOutput = null as any;
utilities.lazyLoad(exports, ["getPolicyAttachments","getPolicyAttachmentsOutput"], () => require("./getPolicyAttachments"));

export { GetPolicyVersionsArgs, GetPolicyVersionsResult, GetPolicyVersionsOutputArgs } from "./getPolicyVersions";
export const getPolicyVersions: typeof import("./getPolicyVersions").getPolicyVersions = null as any;
export const getPolicyVersionsOutput: typeof import("./getPolicyVersions").getPolicyVersionsOutput = null as any;
utilities.lazyLoad(exports, ["getPolicyVersions","getPolicyVersionsOutput"], () => require("./getPolicyVersions"));

export { GetResourceDirectoriesArgs, GetResourceDirectoriesResult, GetResourceDirectoriesOutputArgs } from "./getResourceDirectories";
export const getResourceDirectories: typeof import("./getResourceDirectories").getResourceDirectories = null as any;
export const getResourceDirectoriesOutput: typeof import("./getResourceDirectories").getResourceDirectoriesOutput = null as any;
utilities.lazyLoad(exports, ["getResourceDirectories","getResourceDirectoriesOutput"], () => require("./getResourceDirectories"));

export { GetResourceGroupsArgs, GetResourceGroupsResult, GetResourceGroupsOutputArgs } from "./getResourceGroups";
export const getResourceGroups: typeof import("./getResourceGroups").getResourceGroups = null as any;
export const getResourceGroupsOutput: typeof import("./getResourceGroups").getResourceGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getResourceGroups","getResourceGroupsOutput"], () => require("./getResourceGroups"));

export { GetResourceSharesArgs, GetResourceSharesResult, GetResourceSharesOutputArgs } from "./getResourceShares";
export const getResourceShares: typeof import("./getResourceShares").getResourceShares = null as any;
export const getResourceSharesOutput: typeof import("./getResourceShares").getResourceSharesOutput = null as any;
utilities.lazyLoad(exports, ["getResourceShares","getResourceSharesOutput"], () => require("./getResourceShares"));

export { GetRolesArgs, GetRolesResult, GetRolesOutputArgs } from "./getRoles";
export const getRoles: typeof import("./getRoles").getRoles = null as any;
export const getRolesOutput: typeof import("./getRoles").getRolesOutput = null as any;
utilities.lazyLoad(exports, ["getRoles","getRolesOutput"], () => require("./getRoles"));

export { GetSharedResourcesArgs, GetSharedResourcesResult, GetSharedResourcesOutputArgs } from "./getSharedResources";
export const getSharedResources: typeof import("./getSharedResources").getSharedResources = null as any;
export const getSharedResourcesOutput: typeof import("./getSharedResources").getSharedResourcesOutput = null as any;
utilities.lazyLoad(exports, ["getSharedResources","getSharedResourcesOutput"], () => require("./getSharedResources"));

export { GetSharedTargetsArgs, GetSharedTargetsResult, GetSharedTargetsOutputArgs } from "./getSharedTargets";
export const getSharedTargets: typeof import("./getSharedTargets").getSharedTargets = null as any;
export const getSharedTargetsOutput: typeof import("./getSharedTargets").getSharedTargetsOutput = null as any;
utilities.lazyLoad(exports, ["getSharedTargets","getSharedTargetsOutput"], () => require("./getSharedTargets"));

export { HandshakeArgs, HandshakeState } from "./handshake";
export type Handshake = import("./handshake").Handshake;
export const Handshake: typeof import("./handshake").Handshake = null as any;
utilities.lazyLoad(exports, ["Handshake"], () => require("./handshake"));

export { PolicyArgs, PolicyState } from "./policy";
export type Policy = import("./policy").Policy;
export const Policy: typeof import("./policy").Policy = null as any;
utilities.lazyLoad(exports, ["Policy"], () => require("./policy"));

export { PolicyAttachmentArgs, PolicyAttachmentState } from "./policyAttachment";
export type PolicyAttachment = import("./policyAttachment").PolicyAttachment;
export const PolicyAttachment: typeof import("./policyAttachment").PolicyAttachment = null as any;
utilities.lazyLoad(exports, ["PolicyAttachment"], () => require("./policyAttachment"));

export { PolicyVersionArgs, PolicyVersionState } from "./policyVersion";
export type PolicyVersion = import("./policyVersion").PolicyVersion;
export const PolicyVersion: typeof import("./policyVersion").PolicyVersion = null as any;
utilities.lazyLoad(exports, ["PolicyVersion"], () => require("./policyVersion"));

export { ResourceDirectoryArgs, ResourceDirectoryState } from "./resourceDirectory";
export type ResourceDirectory = import("./resourceDirectory").ResourceDirectory;
export const ResourceDirectory: typeof import("./resourceDirectory").ResourceDirectory = null as any;
utilities.lazyLoad(exports, ["ResourceDirectory"], () => require("./resourceDirectory"));

export { ResourceGroupArgs, ResourceGroupState } from "./resourceGroup";
export type ResourceGroup = import("./resourceGroup").ResourceGroup;
export const ResourceGroup: typeof import("./resourceGroup").ResourceGroup = null as any;
utilities.lazyLoad(exports, ["ResourceGroup"], () => require("./resourceGroup"));

export { ResourceShareArgs, ResourceShareState } from "./resourceShare";
export type ResourceShare = import("./resourceShare").ResourceShare;
export const ResourceShare: typeof import("./resourceShare").ResourceShare = null as any;
utilities.lazyLoad(exports, ["ResourceShare"], () => require("./resourceShare"));

export { RoleArgs, RoleState } from "./role";
export type Role = import("./role").Role;
export const Role: typeof import("./role").Role = null as any;
utilities.lazyLoad(exports, ["Role"], () => require("./role"));

export { SavedQueryArgs, SavedQueryState } from "./savedQuery";
export type SavedQuery = import("./savedQuery").SavedQuery;
export const SavedQuery: typeof import("./savedQuery").SavedQuery = null as any;
utilities.lazyLoad(exports, ["SavedQuery"], () => require("./savedQuery"));

export { ServiceLinkedRoleArgs, ServiceLinkedRoleState } from "./serviceLinkedRole";
export type ServiceLinkedRole = import("./serviceLinkedRole").ServiceLinkedRole;
export const ServiceLinkedRole: typeof import("./serviceLinkedRole").ServiceLinkedRole = null as any;
utilities.lazyLoad(exports, ["ServiceLinkedRole"], () => require("./serviceLinkedRole"));

export { SharedResourceArgs, SharedResourceState } from "./sharedResource";
export type SharedResource = import("./sharedResource").SharedResource;
export const SharedResource: typeof import("./sharedResource").SharedResource = null as any;
utilities.lazyLoad(exports, ["SharedResource"], () => require("./sharedResource"));

export { SharedTargetArgs, SharedTargetState } from "./sharedTarget";
export type SharedTarget = import("./sharedTarget").SharedTarget;
export const SharedTarget: typeof import("./sharedTarget").SharedTarget = null as any;
utilities.lazyLoad(exports, ["SharedTarget"], () => require("./sharedTarget"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:resourcemanager/account:Account":
                return new Account(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/controlPolicy:ControlPolicy":
                return new ControlPolicy(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment":
                return new ControlPolicyAttachment(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/delegatedAdministrator:DelegatedAdministrator":
                return new DelegatedAdministrator(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/folder:Folder":
                return new Folder(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/handshake:Handshake":
                return new Handshake(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/policy:Policy":
                return new Policy(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/policyAttachment:PolicyAttachment":
                return new PolicyAttachment(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/policyVersion:PolicyVersion":
                return new PolicyVersion(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/resourceDirectory:ResourceDirectory":
                return new ResourceDirectory(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/resourceGroup:ResourceGroup":
                return new ResourceGroup(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/resourceShare:ResourceShare":
                return new ResourceShare(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/role:Role":
                return new Role(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/savedQuery:SavedQuery":
                return new SavedQuery(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/serviceLinkedRole:ServiceLinkedRole":
                return new ServiceLinkedRole(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/sharedResource:SharedResource":
                return new SharedResource(name, <any>undefined, { urn })
            case "alicloud:resourcemanager/sharedTarget:SharedTarget":
                return new SharedTarget(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/account", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/controlPolicy", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/controlPolicyAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/delegatedAdministrator", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/folder", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/handshake", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/policy", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/policyAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/policyVersion", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/resourceDirectory", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/resourceGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/resourceShare", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/role", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/savedQuery", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/serviceLinkedRole", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/sharedResource", _module)
pulumi.runtime.registerResourceModule("alicloud", "resourcemanager/sharedTarget", _module)

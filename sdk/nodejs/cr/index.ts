// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./chartNamespace";
export * from "./chartRepository";
export * from "./endpointAclPolicy";
export * from "./getChartNamespaces";
export * from "./getChartRepositories";
export * from "./getEndpointAclPolicies";
export * from "./getEndpointAclService";
export * from "./getNamespaces";
export * from "./getRepos";
export * from "./getService";
export * from "./namespace";
export * from "./registryEnterpriseInstance";
export * from "./repo";

// Import resources to register:
import { ChartNamespace } from "./chartNamespace";
import { ChartRepository } from "./chartRepository";
import { EndpointAclPolicy } from "./endpointAclPolicy";
import { Namespace } from "./namespace";
import { RegistryEnterpriseInstance } from "./registryEnterpriseInstance";
import { Repo } from "./repo";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:cr/chartNamespace:ChartNamespace":
                return new ChartNamespace(name, <any>undefined, { urn })
            case "alicloud:cr/chartRepository:ChartRepository":
                return new ChartRepository(name, <any>undefined, { urn })
            case "alicloud:cr/endpointAclPolicy:EndpointAclPolicy":
                return new EndpointAclPolicy(name, <any>undefined, { urn })
            case "alicloud:cr/namespace:Namespace":
                return new Namespace(name, <any>undefined, { urn })
            case "alicloud:cr/registryEnterpriseInstance:RegistryEnterpriseInstance":
                return new RegistryEnterpriseInstance(name, <any>undefined, { urn })
            case "alicloud:cr/repo:Repo":
                return new Repo(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "cr/chartNamespace", _module)
pulumi.runtime.registerResourceModule("alicloud", "cr/chartRepository", _module)
pulumi.runtime.registerResourceModule("alicloud", "cr/endpointAclPolicy", _module)
pulumi.runtime.registerResourceModule("alicloud", "cr/namespace", _module)
pulumi.runtime.registerResourceModule("alicloud", "cr/registryEnterpriseInstance", _module)
pulumi.runtime.registerResourceModule("alicloud", "cr/repo", _module)

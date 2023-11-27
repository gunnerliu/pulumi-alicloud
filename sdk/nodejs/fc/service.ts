// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service {
        return new Service(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:fc/service:Service';

    /**
     * Returns true if the given object is an instance of Service.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Service {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Service.__pulumiType;
    }

    public readonly description!: pulumi.Output<string | undefined>;
    public readonly internetAccess!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    public readonly logConfig!: pulumi.Output<outputs.fc.ServiceLogConfig | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly namePrefix!: pulumi.Output<string | undefined>;
    public readonly nasConfig!: pulumi.Output<outputs.fc.ServiceNasConfig | undefined>;
    public readonly publish!: pulumi.Output<boolean | undefined>;
    public readonly role!: pulumi.Output<string | undefined>;
    public /*out*/ readonly serviceId!: pulumi.Output<string>;
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly tracingConfig!: pulumi.Output<outputs.fc.ServiceTracingConfig | undefined>;
    public /*out*/ readonly version!: pulumi.Output<string>;
    public readonly vpcConfig!: pulumi.Output<outputs.fc.ServiceVpcConfig | undefined>;

    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceArgs | ServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["internetAccess"] = state ? state.internetAccess : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["logConfig"] = state ? state.logConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["nasConfig"] = state ? state.nasConfig : undefined;
            resourceInputs["publish"] = state ? state.publish : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["serviceId"] = state ? state.serviceId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tracingConfig"] = state ? state.tracingConfig : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["vpcConfig"] = state ? state.vpcConfig : undefined;
        } else {
            const args = argsOrState as ServiceArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["internetAccess"] = args ? args.internetAccess : undefined;
            resourceInputs["logConfig"] = args ? args.logConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["nasConfig"] = args ? args.nasConfig : undefined;
            resourceInputs["publish"] = args ? args.publish : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tracingConfig"] = args ? args.tracingConfig : undefined;
            resourceInputs["vpcConfig"] = args ? args.vpcConfig : undefined;
            resourceInputs["lastModified"] = undefined /*out*/;
            resourceInputs["serviceId"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Service.__pulumiType, name, resourceInputs, opts);
    }
}

export interface ServiceState {
    description?: pulumi.Input<string>;
    internetAccess?: pulumi.Input<boolean>;
    lastModified?: pulumi.Input<string>;
    logConfig?: pulumi.Input<inputs.fc.ServiceLogConfig>;
    name?: pulumi.Input<string>;
    namePrefix?: pulumi.Input<string>;
    nasConfig?: pulumi.Input<inputs.fc.ServiceNasConfig>;
    publish?: pulumi.Input<boolean>;
    role?: pulumi.Input<string>;
    serviceId?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tracingConfig?: pulumi.Input<inputs.fc.ServiceTracingConfig>;
    version?: pulumi.Input<string>;
    vpcConfig?: pulumi.Input<inputs.fc.ServiceVpcConfig>;
}

/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    description?: pulumi.Input<string>;
    internetAccess?: pulumi.Input<boolean>;
    logConfig?: pulumi.Input<inputs.fc.ServiceLogConfig>;
    name?: pulumi.Input<string>;
    namePrefix?: pulumi.Input<string>;
    nasConfig?: pulumi.Input<inputs.fc.ServiceNasConfig>;
    publish?: pulumi.Input<boolean>;
    role?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tracingConfig?: pulumi.Input<inputs.fc.ServiceTracingConfig>;
    vpcConfig?: pulumi.Input<inputs.fc.ServiceVpcConfig>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    public static class GetKubernetesPermission
    {
        /// <summary>
        /// This data source provides a list of Ram user permissions.
        /// 
        /// &gt; **NOTE:** Available in v1.122.0+.
        /// </summary>
        public static Task<GetKubernetesPermissionResult> InvokeAsync(GetKubernetesPermissionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKubernetesPermissionResult>("alicloud:cs/getKubernetesPermission:getKubernetesPermission", args ?? new GetKubernetesPermissionArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of Ram user permissions.
        /// 
        /// &gt; **NOTE:** Available in v1.122.0+.
        /// </summary>
        public static Output<GetKubernetesPermissionResult> Invoke(GetKubernetesPermissionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubernetesPermissionResult>("alicloud:cs/getKubernetesPermission:getKubernetesPermission", args ?? new GetKubernetesPermissionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKubernetesPermissionArgs : global::Pulumi.InvokeArgs
    {
        [Input("permissions")]
        private List<Inputs.GetKubernetesPermissionPermissionArgs>? _permissions;

        /// <summary>
        /// A list of user permission.
        /// </summary>
        public List<Inputs.GetKubernetesPermissionPermissionArgs> Permissions
        {
            get => _permissions ?? (_permissions = new List<Inputs.GetKubernetesPermissionPermissionArgs>());
            set => _permissions = value;
        }

        /// <summary>
        /// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
        /// </summary>
        [Input("uid", required: true)]
        public string Uid { get; set; } = null!;

        public GetKubernetesPermissionArgs()
        {
        }
        public static new GetKubernetesPermissionArgs Empty => new GetKubernetesPermissionArgs();
    }

    public sealed class GetKubernetesPermissionInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("permissions")]
        private InputList<Inputs.GetKubernetesPermissionPermissionInputArgs>? _permissions;

        /// <summary>
        /// A list of user permission.
        /// </summary>
        public InputList<Inputs.GetKubernetesPermissionPermissionInputArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.GetKubernetesPermissionPermissionInputArgs>());
            set => _permissions = value;
        }

        /// <summary>
        /// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
        /// </summary>
        [Input("uid", required: true)]
        public Input<string> Uid { get; set; } = null!;

        public GetKubernetesPermissionInvokeArgs()
        {
        }
        public static new GetKubernetesPermissionInvokeArgs Empty => new GetKubernetesPermissionInvokeArgs();
    }


    [OutputType]
    public sealed class GetKubernetesPermissionResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of user permission.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubernetesPermissionPermissionResult> Permissions;
        /// <summary>
        /// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
        /// </summary>
        public readonly string Uid;

        [OutputConstructor]
        private GetKubernetesPermissionResult(
            string id,

            ImmutableArray<Outputs.GetKubernetesPermissionPermissionResult> permissions,

            string uid)
        {
            Id = id;
            Permissions = permissions;
            Uid = uid;
        }
    }
}

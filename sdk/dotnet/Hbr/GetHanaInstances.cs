// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetHanaInstances
    {
        /// <summary>
        /// This data source provides the Hbr Hana Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.178.0+.
        /// </summary>
        public static Task<GetHanaInstancesResult> InvokeAsync(GetHanaInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHanaInstancesResult>("alicloud:hbr/getHanaInstances:getHanaInstances", args ?? new GetHanaInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr Hana Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.178.0+.
        /// </summary>
        public static Output<GetHanaInstancesResult> Invoke(GetHanaInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHanaInstancesResult>("alicloud:hbr/getHanaInstances:getHanaInstances", args ?? new GetHanaInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHanaInstancesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Hana Instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Hana Instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The status of the SAP HANA instance.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId")]
        public string? VaultId { get; set; }

        public GetHanaInstancesArgs()
        {
        }
        public static new GetHanaInstancesArgs Empty => new GetHanaInstancesArgs();
    }

    public sealed class GetHanaInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Hana Instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Hana Instance name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The status of the SAP HANA instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public GetHanaInstancesInvokeArgs()
        {
        }
        public static new GetHanaInstancesInvokeArgs Empty => new GetHanaInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetHanaInstancesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetHanaInstancesInstanceResult> Instances;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly string? Status;
        public readonly string? VaultId;

        [OutputConstructor]
        private GetHanaInstancesResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetHanaInstancesInstanceResult> instances,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? status,

            string? vaultId)
        {
            Id = id;
            Ids = ids;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            Status = status;
            VaultId = vaultId;
        }
    }
}

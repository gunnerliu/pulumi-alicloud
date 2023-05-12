// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetHanaBackupClients
    {
        /// <summary>
        /// This data source provides the Hybrid Backup Recovery (HBR) Hana Backup Clients of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in 1.198.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Hbr.GetHanaBackupClients.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         VaultId = "your_vault_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrHanaBackupClientsId1"] = ids.Apply(getHanaBackupClientsResult =&gt; getHanaBackupClientsResult.HanaBackupClients[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHanaBackupClientsResult> InvokeAsync(GetHanaBackupClientsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHanaBackupClientsResult>("alicloud:hbr/getHanaBackupClients:getHanaBackupClients", args ?? new GetHanaBackupClientsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hybrid Backup Recovery (HBR) Hana Backup Clients of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in 1.198.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Hbr.GetHanaBackupClients.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         VaultId = "your_vault_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrHanaBackupClientsId1"] = ids.Apply(getHanaBackupClientsResult =&gt; getHanaBackupClientsResult.HanaBackupClients[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHanaBackupClientsResult> Invoke(GetHanaBackupClientsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHanaBackupClientsResult>("alicloud:hbr/getHanaBackupClients:getHanaBackupClients", args ?? new GetHanaBackupClientsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHanaBackupClientsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the backup client.
        /// </summary>
        [Input("clientId")]
        public string? ClientId { get; set; }

        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Input("clusterId")]
        public string? ClusterId { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Hana Backup Client IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

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
        /// The status of the Hana Backup Client. Valid Values: `REGISTERED`, `ACTIVATED`, `DEACTIVATED`, `INSTALLING`, `INSTALL_FAILED`, `NOT_INSTALLED`, `UPGRADING`, `UPGRADE_FAILED`, `UNINSTALLING`, `UNINSTALL_FAILED`, `STOPPED`, `UNKNOWN`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId", required: true)]
        public string VaultId { get; set; } = null!;

        public GetHanaBackupClientsArgs()
        {
        }
        public static new GetHanaBackupClientsArgs Empty => new GetHanaBackupClientsArgs();
    }

    public sealed class GetHanaBackupClientsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the backup client.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Hana Backup Client IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

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
        /// The status of the Hana Backup Client. Valid Values: `REGISTERED`, `ACTIVATED`, `DEACTIVATED`, `INSTALLING`, `INSTALL_FAILED`, `NOT_INSTALLED`, `UPGRADING`, `UPGRADE_FAILED`, `UNINSTALLING`, `UNINSTALL_FAILED`, `STOPPED`, `UNKNOWN`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public GetHanaBackupClientsInvokeArgs()
        {
        }
        public static new GetHanaBackupClientsInvokeArgs Empty => new GetHanaBackupClientsInvokeArgs();
    }


    [OutputType]
    public sealed class GetHanaBackupClientsResult
    {
        /// <summary>
        /// The ID of the backup client.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        public readonly string? ClusterId;
        /// <summary>
        /// A list of Hana Backup Clients. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHanaBackupClientsHanaBackupClientResult> HanaBackupClients;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// The status of the backup client.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        public readonly string VaultId;

        [OutputConstructor]
        private GetHanaBackupClientsResult(
            string? clientId,

            string? clusterId,

            ImmutableArray<Outputs.GetHanaBackupClientsHanaBackupClientResult> hanaBackupClients,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? status,

            string vaultId)
        {
            ClientId = clientId;
            ClusterId = clusterId;
            HanaBackupClients = hanaBackupClients;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            Status = status;
            VaultId = vaultId;
        }
    }
}

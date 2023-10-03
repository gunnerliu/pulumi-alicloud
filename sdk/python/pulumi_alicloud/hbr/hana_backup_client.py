# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HanaBackupClientArgs', 'HanaBackupClient']

@pulumi.input_type
class HanaBackupClientArgs:
    def __init__(__self__, *,
                 vault_id: pulumi.Input[str],
                 alert_setting: Optional[pulumi.Input[str]] = None,
                 client_info: Optional[pulumi.Input[str]] = None,
                 use_https: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a HanaBackupClient resource.
        :param pulumi.Input[str] vault_id: The ID of the backup vault.
        :param pulumi.Input[str] alert_setting: The alert settings. Valid value: `INHERITED`.
        :param pulumi.Input[str] client_info: The installation information of the HBR clients.
        :param pulumi.Input[bool] use_https: Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        """
        HanaBackupClientArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            vault_id=vault_id,
            alert_setting=alert_setting,
            client_info=client_info,
            use_https=use_https,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             vault_id: pulumi.Input[str],
             alert_setting: Optional[pulumi.Input[str]] = None,
             client_info: Optional[pulumi.Input[str]] = None,
             use_https: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("vault_id", vault_id)
        if alert_setting is not None:
            _setter("alert_setting", alert_setting)
        if client_info is not None:
            _setter("client_info", client_info)
        if use_https is not None:
            _setter("use_https", use_https)

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> pulumi.Input[str]:
        """
        The ID of the backup vault.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vault_id", value)

    @property
    @pulumi.getter(name="alertSetting")
    def alert_setting(self) -> Optional[pulumi.Input[str]]:
        """
        The alert settings. Valid value: `INHERITED`.
        """
        return pulumi.get(self, "alert_setting")

    @alert_setting.setter
    def alert_setting(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_setting", value)

    @property
    @pulumi.getter(name="clientInfo")
    def client_info(self) -> Optional[pulumi.Input[str]]:
        """
        The installation information of the HBR clients.
        """
        return pulumi.get(self, "client_info")

    @client_info.setter
    def client_info(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_info", value)

    @property
    @pulumi.getter(name="useHttps")
    def use_https(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "use_https")

    @use_https.setter
    def use_https(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_https", value)


@pulumi.input_type
class _HanaBackupClientState:
    def __init__(__self__, *,
                 alert_setting: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_info: Optional[pulumi.Input[str]] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 use_https: Optional[pulumi.Input[bool]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HanaBackupClient resources.
        :param pulumi.Input[str] alert_setting: The alert settings. Valid value: `INHERITED`.
        :param pulumi.Input[str] client_id: The ID of the backup client.
        :param pulumi.Input[str] client_info: The installation information of the HBR clients.
        :param pulumi.Input[str] cluster_id: The ID of the SAP HANA instance.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] status: The status of the Hana Backup Client.
        :param pulumi.Input[bool] use_https: Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        :param pulumi.Input[str] vault_id: The ID of the backup vault.
        """
        _HanaBackupClientState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            alert_setting=alert_setting,
            client_id=client_id,
            client_info=client_info,
            cluster_id=cluster_id,
            instance_id=instance_id,
            status=status,
            use_https=use_https,
            vault_id=vault_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             alert_setting: Optional[pulumi.Input[str]] = None,
             client_id: Optional[pulumi.Input[str]] = None,
             client_info: Optional[pulumi.Input[str]] = None,
             cluster_id: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             use_https: Optional[pulumi.Input[bool]] = None,
             vault_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if alert_setting is not None:
            _setter("alert_setting", alert_setting)
        if client_id is not None:
            _setter("client_id", client_id)
        if client_info is not None:
            _setter("client_info", client_info)
        if cluster_id is not None:
            _setter("cluster_id", cluster_id)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if status is not None:
            _setter("status", status)
        if use_https is not None:
            _setter("use_https", use_https)
        if vault_id is not None:
            _setter("vault_id", vault_id)

    @property
    @pulumi.getter(name="alertSetting")
    def alert_setting(self) -> Optional[pulumi.Input[str]]:
        """
        The alert settings. Valid value: `INHERITED`.
        """
        return pulumi.get(self, "alert_setting")

    @alert_setting.setter
    def alert_setting(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_setting", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the backup client.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientInfo")
    def client_info(self) -> Optional[pulumi.Input[str]]:
        """
        The installation information of the HBR clients.
        """
        return pulumi.get(self, "client_info")

    @client_info.setter
    def client_info(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_info", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the SAP HANA instance.
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Hana Backup Client.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="useHttps")
    def use_https(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "use_https")

    @use_https.setter
    def use_https(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_https", value)

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the backup vault.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vault_id", value)


class HanaBackupClient(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_setting: Optional[pulumi.Input[str]] = None,
                 client_info: Optional[pulumi.Input[str]] = None,
                 use_https: Optional[pulumi.Input[bool]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Hybrid Backup Recovery (HBR) Hana Backup Client resource.

        For information about Hybrid Backup Recovery (HBR) Hana Backup Client and how to use it, see [What is Hana Backup Client](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/api-doc-hbr-2017-09-08-api-doc-createclients).

        > **NOTE:** Available in v1.198.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_zones = alicloud.get_zones(available_resource_creation="Instance")
        example_instance_types = alicloud.ecs.get_instance_types(availability_zone=example_zones.zones[0].id,
            cpu_core_count=1,
            memory_size=2)
        example_images = alicloud.ecs.get_images(name_regex="^ubuntu_[0-9]+_[0-9]+_x64*",
            owners="system")
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=example_network.id,
            zone_id=example_zones.zones[0].id)
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_instance = alicloud.ecs.Instance("exampleInstance",
            image_id=example_images.images[0].id,
            instance_type=example_instance_types.instance_types[0].id,
            availability_zone=example_zones.zones[0].id,
            security_groups=[example_security_group.id],
            instance_name="terraform-example",
            internet_charge_type="PayByBandwidth",
            vswitch_id=example_switch.id)
        example_resource_groups = alicloud.resourcemanager.get_resource_groups(status="OK")
        example_vault = alicloud.hbr.Vault("exampleVault", vault_name="terraform-example")
        example_hana_instance = alicloud.hbr.HanaInstance("exampleHanaInstance",
            alert_setting="INHERITED",
            hana_name="terraform-example",
            host="1.1.1.1",
            instance_number=1,
            password="YouPassword123",
            resource_group_id=example_resource_groups.groups[0].id,
            sid="HXE",
            use_ssl=False,
            user_name="admin",
            validate_certificate=False,
            vault_id=example_vault.id)
        default = alicloud.hbr.HanaBackupClient("default",
            vault_id=example_vault.id,
            client_info=pulumi.Output.all(example_instance.id, example_hana_instance.hana_instance_id).apply(lambda id, hana_instance_id: f"[ {{ \\"instanceId\\": \\"{id}\\", \\"clusterId\\": \\"{hana_instance_id}\\", \\"sourceTypes\\": [ \\"HANA\\" ]  }}]"),
            alert_setting="INHERITED",
            use_https=True)
        ```

        ## Import

        Hybrid Backup Recovery (HBR) Hana Backup Client can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:hbr/hanaBackupClient:HanaBackupClient example <vault_id>:<client_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_setting: The alert settings. Valid value: `INHERITED`.
        :param pulumi.Input[str] client_info: The installation information of the HBR clients.
        :param pulumi.Input[bool] use_https: Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        :param pulumi.Input[str] vault_id: The ID of the backup vault.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HanaBackupClientArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hybrid Backup Recovery (HBR) Hana Backup Client resource.

        For information about Hybrid Backup Recovery (HBR) Hana Backup Client and how to use it, see [What is Hana Backup Client](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/api-doc-hbr-2017-09-08-api-doc-createclients).

        > **NOTE:** Available in v1.198.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_zones = alicloud.get_zones(available_resource_creation="Instance")
        example_instance_types = alicloud.ecs.get_instance_types(availability_zone=example_zones.zones[0].id,
            cpu_core_count=1,
            memory_size=2)
        example_images = alicloud.ecs.get_images(name_regex="^ubuntu_[0-9]+_[0-9]+_x64*",
            owners="system")
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name="terraform-example",
            cidr_block="172.17.3.0/24")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name="terraform-example",
            cidr_block="172.17.3.0/24",
            vpc_id=example_network.id,
            zone_id=example_zones.zones[0].id)
        example_security_group = alicloud.ecs.SecurityGroup("exampleSecurityGroup", vpc_id=example_network.id)
        example_instance = alicloud.ecs.Instance("exampleInstance",
            image_id=example_images.images[0].id,
            instance_type=example_instance_types.instance_types[0].id,
            availability_zone=example_zones.zones[0].id,
            security_groups=[example_security_group.id],
            instance_name="terraform-example",
            internet_charge_type="PayByBandwidth",
            vswitch_id=example_switch.id)
        example_resource_groups = alicloud.resourcemanager.get_resource_groups(status="OK")
        example_vault = alicloud.hbr.Vault("exampleVault", vault_name="terraform-example")
        example_hana_instance = alicloud.hbr.HanaInstance("exampleHanaInstance",
            alert_setting="INHERITED",
            hana_name="terraform-example",
            host="1.1.1.1",
            instance_number=1,
            password="YouPassword123",
            resource_group_id=example_resource_groups.groups[0].id,
            sid="HXE",
            use_ssl=False,
            user_name="admin",
            validate_certificate=False,
            vault_id=example_vault.id)
        default = alicloud.hbr.HanaBackupClient("default",
            vault_id=example_vault.id,
            client_info=pulumi.Output.all(example_instance.id, example_hana_instance.hana_instance_id).apply(lambda id, hana_instance_id: f"[ {{ \\"instanceId\\": \\"{id}\\", \\"clusterId\\": \\"{hana_instance_id}\\", \\"sourceTypes\\": [ \\"HANA\\" ]  }}]"),
            alert_setting="INHERITED",
            use_https=True)
        ```

        ## Import

        Hybrid Backup Recovery (HBR) Hana Backup Client can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:hbr/hanaBackupClient:HanaBackupClient example <vault_id>:<client_id>
        ```

        :param str resource_name: The name of the resource.
        :param HanaBackupClientArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HanaBackupClientArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            HanaBackupClientArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_setting: Optional[pulumi.Input[str]] = None,
                 client_info: Optional[pulumi.Input[str]] = None,
                 use_https: Optional[pulumi.Input[bool]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HanaBackupClientArgs.__new__(HanaBackupClientArgs)

            __props__.__dict__["alert_setting"] = alert_setting
            __props__.__dict__["client_info"] = client_info
            __props__.__dict__["use_https"] = use_https
            if vault_id is None and not opts.urn:
                raise TypeError("Missing required property 'vault_id'")
            __props__.__dict__["vault_id"] = vault_id
            __props__.__dict__["client_id"] = None
            __props__.__dict__["cluster_id"] = None
            __props__.__dict__["instance_id"] = None
            __props__.__dict__["status"] = None
        super(HanaBackupClient, __self__).__init__(
            'alicloud:hbr/hanaBackupClient:HanaBackupClient',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alert_setting: Optional[pulumi.Input[str]] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            client_info: Optional[pulumi.Input[str]] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            use_https: Optional[pulumi.Input[bool]] = None,
            vault_id: Optional[pulumi.Input[str]] = None) -> 'HanaBackupClient':
        """
        Get an existing HanaBackupClient resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_setting: The alert settings. Valid value: `INHERITED`.
        :param pulumi.Input[str] client_id: The ID of the backup client.
        :param pulumi.Input[str] client_info: The installation information of the HBR clients.
        :param pulumi.Input[str] cluster_id: The ID of the SAP HANA instance.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] status: The status of the Hana Backup Client.
        :param pulumi.Input[bool] use_https: Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        :param pulumi.Input[str] vault_id: The ID of the backup vault.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HanaBackupClientState.__new__(_HanaBackupClientState)

        __props__.__dict__["alert_setting"] = alert_setting
        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["client_info"] = client_info
        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["status"] = status
        __props__.__dict__["use_https"] = use_https
        __props__.__dict__["vault_id"] = vault_id
        return HanaBackupClient(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alertSetting")
    def alert_setting(self) -> pulumi.Output[str]:
        """
        The alert settings. Valid value: `INHERITED`.
        """
        return pulumi.get(self, "alert_setting")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        """
        The ID of the backup client.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientInfo")
    def client_info(self) -> pulumi.Output[Optional[str]]:
        """
        The installation information of the HBR clients.
        """
        return pulumi.get(self, "client_info")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The ID of the SAP HANA instance.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Hana Backup Client.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="useHttps")
    def use_https(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to transmit data over HTTPS. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "use_https")

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> pulumi.Output[str]:
        """
        The ID of the backup vault.
        """
        return pulumi.get(self, "vault_id")


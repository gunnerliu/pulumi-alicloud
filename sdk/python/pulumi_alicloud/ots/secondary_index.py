# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecondaryIndexArgs', 'SecondaryIndex']

@pulumi.input_type
class SecondaryIndexArgs:
    def __init__(__self__, *,
                 include_base_data: pulumi.Input[bool],
                 index_name: pulumi.Input[str],
                 index_type: pulumi.Input[str],
                 instance_name: pulumi.Input[str],
                 primary_keys: pulumi.Input[Sequence[pulumi.Input[str]]],
                 table_name: pulumi.Input[str],
                 defined_columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SecondaryIndex resource.
        :param pulumi.Input[bool] include_base_data: whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        :param pulumi.Input[str] index_name: The index name of the OTS Table. If changed, a new index would be created.
        :param pulumi.Input[str] index_type: The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        :param pulumi.Input[str] instance_name: The name of the OTS instance in which table will located.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] primary_keys: A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        :param pulumi.Input[str] table_name: The name of the OTS table. If changed, a new table would be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] defined_columns: A list of defined column for index, referenced from Table's primary keys or predefined columns.
        """
        pulumi.set(__self__, "include_base_data", include_base_data)
        pulumi.set(__self__, "index_name", index_name)
        pulumi.set(__self__, "index_type", index_type)
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "primary_keys", primary_keys)
        pulumi.set(__self__, "table_name", table_name)
        if defined_columns is not None:
            pulumi.set(__self__, "defined_columns", defined_columns)

    @property
    @pulumi.getter(name="includeBaseData")
    def include_base_data(self) -> pulumi.Input[bool]:
        """
        whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        """
        return pulumi.get(self, "include_base_data")

    @include_base_data.setter
    def include_base_data(self, value: pulumi.Input[bool]):
        pulumi.set(self, "include_base_data", value)

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> pulumi.Input[str]:
        """
        The index name of the OTS Table. If changed, a new index would be created.
        """
        return pulumi.get(self, "index_name")

    @index_name.setter
    def index_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "index_name", value)

    @property
    @pulumi.getter(name="indexType")
    def index_type(self) -> pulumi.Input[str]:
        """
        The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        """
        return pulumi.get(self, "index_type")

    @index_type.setter
    def index_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "index_type", value)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Input[str]:
        """
        The name of the OTS instance in which table will located.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="primaryKeys")
    def primary_keys(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        """
        return pulumi.get(self, "primary_keys")

    @primary_keys.setter
    def primary_keys(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "primary_keys", value)

    @property
    @pulumi.getter(name="tableName")
    def table_name(self) -> pulumi.Input[str]:
        """
        The name of the OTS table. If changed, a new table would be created.
        """
        return pulumi.get(self, "table_name")

    @table_name.setter
    def table_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "table_name", value)

    @property
    @pulumi.getter(name="definedColumns")
    def defined_columns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of defined column for index, referenced from Table's primary keys or predefined columns.
        """
        return pulumi.get(self, "defined_columns")

    @defined_columns.setter
    def defined_columns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "defined_columns", value)


@pulumi.input_type
class _SecondaryIndexState:
    def __init__(__self__, *,
                 defined_columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 include_base_data: Optional[pulumi.Input[bool]] = None,
                 index_name: Optional[pulumi.Input[str]] = None,
                 index_type: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 primary_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 table_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecondaryIndex resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] defined_columns: A list of defined column for index, referenced from Table's primary keys or predefined columns.
        :param pulumi.Input[bool] include_base_data: whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        :param pulumi.Input[str] index_name: The index name of the OTS Table. If changed, a new index would be created.
        :param pulumi.Input[str] index_type: The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        :param pulumi.Input[str] instance_name: The name of the OTS instance in which table will located.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] primary_keys: A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        :param pulumi.Input[str] table_name: The name of the OTS table. If changed, a new table would be created.
        """
        if defined_columns is not None:
            pulumi.set(__self__, "defined_columns", defined_columns)
        if include_base_data is not None:
            pulumi.set(__self__, "include_base_data", include_base_data)
        if index_name is not None:
            pulumi.set(__self__, "index_name", index_name)
        if index_type is not None:
            pulumi.set(__self__, "index_type", index_type)
        if instance_name is not None:
            pulumi.set(__self__, "instance_name", instance_name)
        if primary_keys is not None:
            pulumi.set(__self__, "primary_keys", primary_keys)
        if table_name is not None:
            pulumi.set(__self__, "table_name", table_name)

    @property
    @pulumi.getter(name="definedColumns")
    def defined_columns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of defined column for index, referenced from Table's primary keys or predefined columns.
        """
        return pulumi.get(self, "defined_columns")

    @defined_columns.setter
    def defined_columns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "defined_columns", value)

    @property
    @pulumi.getter(name="includeBaseData")
    def include_base_data(self) -> Optional[pulumi.Input[bool]]:
        """
        whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        """
        return pulumi.get(self, "include_base_data")

    @include_base_data.setter
    def include_base_data(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "include_base_data", value)

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> Optional[pulumi.Input[str]]:
        """
        The index name of the OTS Table. If changed, a new index would be created.
        """
        return pulumi.get(self, "index_name")

    @index_name.setter
    def index_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "index_name", value)

    @property
    @pulumi.getter(name="indexType")
    def index_type(self) -> Optional[pulumi.Input[str]]:
        """
        The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        """
        return pulumi.get(self, "index_type")

    @index_type.setter
    def index_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "index_type", value)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the OTS instance in which table will located.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="primaryKeys")
    def primary_keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        """
        return pulumi.get(self, "primary_keys")

    @primary_keys.setter
    def primary_keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "primary_keys", value)

    @property
    @pulumi.getter(name="tableName")
    def table_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the OTS table. If changed, a new table would be created.
        """
        return pulumi.get(self, "table_name")

    @table_name.setter
    def table_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "table_name", value)


class SecondaryIndex(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 defined_columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 include_base_data: Optional[pulumi.Input[bool]] = None,
                 index_name: Optional[pulumi.Input[str]] = None,
                 index_type: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 primary_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 table_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an OTS secondary index resource.

        For information about OTS secondary index and how to use it, see [Secondary index overview](https://www.alibabacloud.com/help/en/tablestore/latest/secondary-index-overview).

        > **NOTE:** Available since v1.187.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_random_integer = random.RandomInteger("defaultRandomInteger",
            min=10000,
            max=99999)
        default_instance = alicloud.ots.Instance("defaultInstance",
            description=name,
            accessed_by="Any",
            tags={
                "Created": "TF",
                "For": "example",
            })
        default_table = alicloud.ots.Table("defaultTable",
            instance_name=default_instance.name,
            table_name="tf_example",
            time_to_live=-1,
            max_version=1,
            enable_sse=True,
            sse_key_type="SSE_KMS_SERVICE",
            primary_keys=[
                alicloud.ots.TablePrimaryKeyArgs(
                    name="pk1",
                    type="Integer",
                ),
                alicloud.ots.TablePrimaryKeyArgs(
                    name="pk2",
                    type="String",
                ),
                alicloud.ots.TablePrimaryKeyArgs(
                    name="pk3",
                    type="Binary",
                ),
            ],
            defined_columns=[
                alicloud.ots.TableDefinedColumnArgs(
                    name="col1",
                    type="Integer",
                ),
                alicloud.ots.TableDefinedColumnArgs(
                    name="col2",
                    type="String",
                ),
                alicloud.ots.TableDefinedColumnArgs(
                    name="col3",
                    type="Binary",
                ),
            ])
        default_secondary_index = alicloud.ots.SecondaryIndex("defaultSecondaryIndex",
            instance_name=default_instance.name,
            table_name=default_table.table_name,
            index_name="example_index",
            index_type="Global",
            include_base_data=True,
            primary_keys=[
                "pk1",
                "pk2",
                "pk3",
            ],
            defined_columns=[
                "col1",
                "col2",
                "col3",
            ])
        ```

        ## Import

        OTS secondary index can be imported using id, e.g.

        ```sh
         $ pulumi import alicloud:ots/secondaryIndex:SecondaryIndex index1 <instance_name>:<table_name>:<index_name>:<index_type>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] defined_columns: A list of defined column for index, referenced from Table's primary keys or predefined columns.
        :param pulumi.Input[bool] include_base_data: whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        :param pulumi.Input[str] index_name: The index name of the OTS Table. If changed, a new index would be created.
        :param pulumi.Input[str] index_type: The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        :param pulumi.Input[str] instance_name: The name of the OTS instance in which table will located.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] primary_keys: A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        :param pulumi.Input[str] table_name: The name of the OTS table. If changed, a new table would be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecondaryIndexArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an OTS secondary index resource.

        For information about OTS secondary index and how to use it, see [Secondary index overview](https://www.alibabacloud.com/help/en/tablestore/latest/secondary-index-overview).

        > **NOTE:** Available since v1.187.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_random_integer = random.RandomInteger("defaultRandomInteger",
            min=10000,
            max=99999)
        default_instance = alicloud.ots.Instance("defaultInstance",
            description=name,
            accessed_by="Any",
            tags={
                "Created": "TF",
                "For": "example",
            })
        default_table = alicloud.ots.Table("defaultTable",
            instance_name=default_instance.name,
            table_name="tf_example",
            time_to_live=-1,
            max_version=1,
            enable_sse=True,
            sse_key_type="SSE_KMS_SERVICE",
            primary_keys=[
                alicloud.ots.TablePrimaryKeyArgs(
                    name="pk1",
                    type="Integer",
                ),
                alicloud.ots.TablePrimaryKeyArgs(
                    name="pk2",
                    type="String",
                ),
                alicloud.ots.TablePrimaryKeyArgs(
                    name="pk3",
                    type="Binary",
                ),
            ],
            defined_columns=[
                alicloud.ots.TableDefinedColumnArgs(
                    name="col1",
                    type="Integer",
                ),
                alicloud.ots.TableDefinedColumnArgs(
                    name="col2",
                    type="String",
                ),
                alicloud.ots.TableDefinedColumnArgs(
                    name="col3",
                    type="Binary",
                ),
            ])
        default_secondary_index = alicloud.ots.SecondaryIndex("defaultSecondaryIndex",
            instance_name=default_instance.name,
            table_name=default_table.table_name,
            index_name="example_index",
            index_type="Global",
            include_base_data=True,
            primary_keys=[
                "pk1",
                "pk2",
                "pk3",
            ],
            defined_columns=[
                "col1",
                "col2",
                "col3",
            ])
        ```

        ## Import

        OTS secondary index can be imported using id, e.g.

        ```sh
         $ pulumi import alicloud:ots/secondaryIndex:SecondaryIndex index1 <instance_name>:<table_name>:<index_name>:<index_type>
        ```

        :param str resource_name: The name of the resource.
        :param SecondaryIndexArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecondaryIndexArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 defined_columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 include_base_data: Optional[pulumi.Input[bool]] = None,
                 index_name: Optional[pulumi.Input[str]] = None,
                 index_type: Optional[pulumi.Input[str]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 primary_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 table_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecondaryIndexArgs.__new__(SecondaryIndexArgs)

            __props__.__dict__["defined_columns"] = defined_columns
            if include_base_data is None and not opts.urn:
                raise TypeError("Missing required property 'include_base_data'")
            __props__.__dict__["include_base_data"] = include_base_data
            if index_name is None and not opts.urn:
                raise TypeError("Missing required property 'index_name'")
            __props__.__dict__["index_name"] = index_name
            if index_type is None and not opts.urn:
                raise TypeError("Missing required property 'index_type'")
            __props__.__dict__["index_type"] = index_type
            if instance_name is None and not opts.urn:
                raise TypeError("Missing required property 'instance_name'")
            __props__.__dict__["instance_name"] = instance_name
            if primary_keys is None and not opts.urn:
                raise TypeError("Missing required property 'primary_keys'")
            __props__.__dict__["primary_keys"] = primary_keys
            if table_name is None and not opts.urn:
                raise TypeError("Missing required property 'table_name'")
            __props__.__dict__["table_name"] = table_name
        super(SecondaryIndex, __self__).__init__(
            'alicloud:ots/secondaryIndex:SecondaryIndex',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            defined_columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            include_base_data: Optional[pulumi.Input[bool]] = None,
            index_name: Optional[pulumi.Input[str]] = None,
            index_type: Optional[pulumi.Input[str]] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            primary_keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            table_name: Optional[pulumi.Input[str]] = None) -> 'SecondaryIndex':
        """
        Get an existing SecondaryIndex resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] defined_columns: A list of defined column for index, referenced from Table's primary keys or predefined columns.
        :param pulumi.Input[bool] include_base_data: whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        :param pulumi.Input[str] index_name: The index name of the OTS Table. If changed, a new index would be created.
        :param pulumi.Input[str] index_type: The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        :param pulumi.Input[str] instance_name: The name of the OTS instance in which table will located.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] primary_keys: A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        :param pulumi.Input[str] table_name: The name of the OTS table. If changed, a new table would be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecondaryIndexState.__new__(_SecondaryIndexState)

        __props__.__dict__["defined_columns"] = defined_columns
        __props__.__dict__["include_base_data"] = include_base_data
        __props__.__dict__["index_name"] = index_name
        __props__.__dict__["index_type"] = index_type
        __props__.__dict__["instance_name"] = instance_name
        __props__.__dict__["primary_keys"] = primary_keys
        __props__.__dict__["table_name"] = table_name
        return SecondaryIndex(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="definedColumns")
    def defined_columns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of defined column for index, referenced from Table's primary keys or predefined columns.
        """
        return pulumi.get(self, "defined_columns")

    @property
    @pulumi.getter(name="includeBaseData")
    def include_base_data(self) -> pulumi.Output[bool]:
        """
        whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        """
        return pulumi.get(self, "include_base_data")

    @property
    @pulumi.getter(name="indexName")
    def index_name(self) -> pulumi.Output[str]:
        """
        The index name of the OTS Table. If changed, a new index would be created.
        """
        return pulumi.get(self, "index_name")

    @property
    @pulumi.getter(name="indexType")
    def index_type(self) -> pulumi.Output[str]:
        """
        The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        """
        return pulumi.get(self, "index_type")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[str]:
        """
        The name of the OTS instance in which table will located.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="primaryKeys")
    def primary_keys(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        """
        return pulumi.get(self, "primary_keys")

    @property
    @pulumi.getter(name="tableName")
    def table_name(self) -> pulumi.Output[str]:
        """
        The name of the OTS table. If changed, a new table would be created.
        """
        return pulumi.get(self, "table_name")

